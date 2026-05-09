package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cursojetpackcomposearistidevs.R

@Preview
@Composable
fun MyImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "avatar image profile",
        modifier = Modifier
            .height(200.dp)
            .width(30.dp),
        contentScale = ContentScale.Inside
    )

}