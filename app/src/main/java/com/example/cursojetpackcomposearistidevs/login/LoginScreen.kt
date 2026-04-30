package com.example.cursojetpackcomposearistidevs.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! PEPITOOOooo",
        modifier = modifier
    )
}

@Preview
@Composable
fun Example1() {
    Text(text = "Sergio :)", modifier = Modifier.size(50.dp).background(Color.Red ))
}
