package com.example.a3d_mobile.utils

import android.content.Context
import java.nio.ByteBuffer

class GLBLoader(private val context: Context) {

    fun loadGLB(resId: Int): ByteBuffer {
        // Now you can use 'context' here
        val buffer = context.resources.openRawResource(resId).use { input ->
            val bytes = input.readBytes()
            ByteBuffer.allocateDirect(bytes.size).apply {
                put(bytes)
                rewind()
            }
        }
        return buffer
    }
}