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
    var showDialog by remember { mutableStateOf(true) }
    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            confirmButton = { Button(onClick = { showDialog = false }) { Text("Entendido") } },
            text = { Text("Esta es mi descripción") }
        )
    }
}

@Preview
@Composable
private fun MyPreview1() {


}