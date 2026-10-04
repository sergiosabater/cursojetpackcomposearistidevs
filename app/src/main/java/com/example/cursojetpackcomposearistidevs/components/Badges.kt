package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.material3.Badge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MyBadge(modifier: Modifier = Modifier) {
    Badge(
        contentColor = Color.Blue,
        containerColor = Color.Green
    ) {
        Text("4")
    }
}

@Composable
fun MyBadgeBox(modifier: Modifier = Modifier) {
    
}