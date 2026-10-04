package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.cursojetpackcomposearistidevs.R

@Composable
fun MyBadge() {
    Badge(
        contentColor = Color.Blue,
        containerColor = Color.Green
    ) {
        Text("4")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyBadgeBox(modifier: Modifier = Modifier) {
    BadgedBox(modifier = modifier, badge = { MyBadge() }) {
        Icon(
            painter = painterResource(
                R.drawable.ic_shopping_cart
            ),
            contentDescription = null
        )
    }
}