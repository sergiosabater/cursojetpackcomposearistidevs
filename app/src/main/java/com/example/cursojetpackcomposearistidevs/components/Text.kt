package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun MyTexts(modifier: Modifier = Modifier) {
    Column(modifier) {
        Text("Pepe")
        Text("Pepe", color = Color.Red)
        Text("Pepe", fontSize = 25.sp)
        Text("Pepe", fontStyle = FontStyle.Italic)
        Text(
            "Pepe",
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic,
            fontSize = 25.sp
        )
        Text("Pepe", letterSpacing = 20.sp)
        Text("Pepe", textDecoration = TextDecoration.LineThrough)
        Text("Pepe", textDecoration = TextDecoration.Underline + TextDecoration.LineThrough)
        Text(
            "Pepe",
            textDecoration = TextDecoration.Underline,
            color = Color.Blue,
            modifier = Modifier.clickable {})
        Text("Pepe", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        Text(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur odio neque, auctor et ante at, porttitor condimentum ex. Vestibulum ac magna elementum, ultricies mauris quis, auctor quam. Vestibulum tincidunt ligula turpis, ac finibus augue tempor a. Maecenas rutrum suscipit risus at volutpat. Donec id pulvinar nisl, sit amet scelerisque nulla. Praesent a neque nulla. Sed gravida nisl tristique cursus elementum. ",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}