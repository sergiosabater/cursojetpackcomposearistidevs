package com.example.cursojetpackcomposearistidevs.state

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun MyState(modifier: Modifier) {
    val number = remember { mutableStateOf(0) }
    Text("Pulsado: ${number.value}", modifier = modifier.clickable { number.value += 1 })

}