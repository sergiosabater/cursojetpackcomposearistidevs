package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.cursojetpackcomposearistidevs.R

@Composable
fun MyNavigationBar(modifier: Modifier = Modifier) {
    NavigationBar() {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(R.drawable.baseline_info_outline_24),
                    contentDescription = null
                )
            },
            label = { Text("Home") },
            alwaysShowLabel = true,
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.Red,
                selectedTextColor = Color.Red,
                indicatorColor = Color.White
            )
        )
    }
}