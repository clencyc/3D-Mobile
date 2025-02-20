package com.example.a3d_mobile

import android.graphics.Camera
import androidx.xr.scenecore.Fov

fun setupCamera(camera: Camera, width: Int, height: Int) {
    camera.lookAt(0.0, 0.0, 10.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0)
    camera.setProjection(45.0, width.toDouble() / height, 0.1, 10000.0, Camera.Fov.VERTICAL)
}