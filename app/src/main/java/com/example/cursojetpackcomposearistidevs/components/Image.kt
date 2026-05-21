package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cursojetpackcomposearistidevs.R

@Preview
@Composable
fun MyImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.payaso),
        contentDescription = "avatar image profile",
        modifier = Modifier
            .size(100.dp)
            .clip(RoundedCornerShape(50))
            .border(
                width = 2.dp,
                shape = CircleShape,
                brush = Brush.linearGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Yellow)
                )
            ),
        contentScale = ContentScale.Inside
    )

}