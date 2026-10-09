package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyDialog(modifier: Modifier = Modifier) {
    var status by remember { mutableStateOf(true) }
    AlertDialog(
        onDismissRequest = { status = false },
        confirmButton = { Button(onClick = { status = false }) { Text("Entendido") } }
    )
}

@Preview
@Composable
private fun MyPreview1() {


}