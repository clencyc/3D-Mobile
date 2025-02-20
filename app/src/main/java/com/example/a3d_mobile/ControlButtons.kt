package com.example.a3d_mobile

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ControlButtons(
    onLeft: () -> Unit, onRight: () -> Unit, onJump: () -> Unit) {
    Row {
        Button(onClick = onLeft) { Text("Left") }
        Button(onClick = onRight) { Text("Right") }
        Button(onClick = onJump) { Text("Jump") }
    }

}