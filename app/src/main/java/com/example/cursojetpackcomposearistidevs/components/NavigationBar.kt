package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.cursojetpackcomposearistidevs.R

@Composable
fun MyNavigationBar(modifier: Modifier = Modifier) {
    NavigationBar() {
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(R.drawable.baseline_info_outline_24),
                    contentDescription = null
                )
            })
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(R.drawable.baseline_info_outline_24),
                    contentDescription = null
                )
            })
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(R.drawable.baseline_info_outline_24),
                    contentDescription = null
                )
            })
    }
}