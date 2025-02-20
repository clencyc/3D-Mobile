package com.example.a3d_mobile

import android.view.Choreographer
import android.view.SurfaceView
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import com.example.a3d_mobile.utils.loadGLB
import com.google.android.filament.*
import com.google.android.filament.gltfio.*

@Composable
fun FilamentScene(modifier: Modifier = Modifier, resId: Int) {
    val context = LocalContext.current
    val engine = remember { Engine.create() }
    val renderer = remember { engine.createRenderer() }
    val scene = remember { engine.createScene() }
    val view = remember { engine.createView() }
    // Correctly create the camera
    val cameraEntity = remember { EntityManager.get().create() }
    val camera = remember { engine.createCamera(cameraEntity) }
    val materialProvider = remember { UbershaderLoader(engine) }
    val assetLoader = remember { AssetLoader(engine, materialProvider, EntityManager.get()) }
    var asset: FilamentAsset? = null
    val choreographer = remember { Choreographer.getInstance() }
    var frameCallback: Choreographer.FrameCallback? = null

    // Set up the view
    view.scene = scene
    view.camera = camera

    // Set up the camera
    camera.lookAt(0.0, 0.0, 10.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0)
    // Add the camera to the scene
    scene.addEntity(cameraEntity)


    loadGLB(resId)

    AndroidView(
        modifier = modifier,
        factory = { context ->
            SurfaceView(context).apply {
                holder.addCallback(object : android.view.SurfaceHolder.Callback {
                    override fun surfaceCreated(holder: android.view.SurfaceHolder) {
                        val swapChain = engine.createSwapChain(holder.surface)
                        frameCallback = Choreographer.FrameCallback { frameTimeNanos ->
                            if (renderer.beginFrame(swapChain, frameTimeNanos)) {
                                renderer.render(view)
                                renderer.endFrame()
                            }
                            choreographer.postFrameCallback(frameCallback!!)
                        }
                        choreographer.postFrameCallback(frameCallback!!)
                        view.viewport = Viewport(0, 0, width, height)
                        camera.setProjection(45.0, width.toDouble() / height, 0.1, 10000.0, Camera.Fov.VERTICAL)
                    }

                    override fun surfaceChanged(
                        holder: android.view.SurfaceHolder,
                        format: Int,
                        width: Int,
                        height: Int
                    ) {
                        view.viewport = Viewport(0, 0, width, height)
                        camera.setProjection(45.0, width.toDouble() / height, 0.1, 10000.0, Camera.Fov.VERTICAL)
                    }

                    override fun surfaceDestroyed(holder: android.view.SurfaceHolder) {
                        frameCallback?.let { choreographer.removeFrameCallback(it) }
                    }
                })
            }
        },
    )

    DisposableEffect(Unit) {
        onDispose {
            // Destroy the asset
            asset?.let { assetLoader.destroyAsset(it) }

            // Destroy the asset loader
            assetLoader.destroy()

            // Destroy the view
            engine.destroyView(view)

            // Destroy the scene
            engine.destroyScene(scene)
            // Destroy the camera
            engine.destroyCameraComponent(cameraEntity)
            EntityManager.get().destroy(cameraEntity)

            // Destroy the renderer
            engine.destroyRenderer(renderer)

            // Destroy the engine
            engine.destroy()
        }
    }
}
