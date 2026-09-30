package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cursojetpackcomposearistidevs.ui.theme.CursoJetpackComposeAristiDevsTheme

@Composable
fun MyCard(modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Row {
            Box(
                modifier = Modifier
                    .size(75.dp)
                    .clip(CircleShape)
                    .background(Color.Red)
            ) { }
            Column {
                Text("Sergio")
                Text("Sergio2")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyPreview() {
    CursoJetpackComposeAristiDevsTheme {
        MyCard()
    }
}