package com.example.a3d_mobile.utils

import android.util.Log
import com.google.android.filament.gltfio.FilamentAsset
import java.nio.ByteBuffer


fun loadGLB(resId: Int): FilamentAsset? {
    return try {
        val buffer = context.resources.openRawResource(resId).use { input ->
            val bytes = input.readBytes()
            ByteBuffer.allocateDirect(bytes.size).apply {
                put(bytes)
                rewind()
            }
        }
        assetLoader.createAssetFromBinary(buffer)
    } catch (e: Exception) {
        Log.e("FilamentScene", "Failed to load GLB file", e)
        null
    }
}