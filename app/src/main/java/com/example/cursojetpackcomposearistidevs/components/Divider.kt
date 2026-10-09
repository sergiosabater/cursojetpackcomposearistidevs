package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyDivider(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("Parte de arriba")
        HorizontalDivider(thickness = 3.dp, color = Color.Red)
        Text("Parte de abajo")

        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier.height(IntrinsicSize.Min)) {
            Text("Izquierda")
            VerticalDivider(thickness = 6.dp, color = Color.Green)
            Text("Derecha")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyPreview(modifier: Modifier = Modifier) {
    Column() {
        Spacer(modifier = Modifier.height(50.dp))
        MyDivider()
    }
}