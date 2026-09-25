package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.cursojetpackcomposearistidevs.components.model.NavItem

@Composable
fun MyNavigationBar(modifier: Modifier = Modifier) {
    val itemList = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Favorite", Icons.Default.Favorite),
        NavItem("Profile", Icons.Default.Person),
    )

    NavigationBar() {
        itemList.forEach { item ->
            MyNavigationBarItem(item)
        }
    }
}

@Composable
fun RowScope.MyNavigationBarItem(item: NavItem) {
    NavigationBarItem(
        selected = true,
        onClick = {},
        icon = {
            Icon(
                imageVector = item.icon,
                contentDescription = null
            )
        },
        label = { Text(item.name) },
        alwaysShowLabel = true,
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color.Red,
            selectedTextColor = Color.Red,
            indicatorColor = Color.White,
            unselectedIconColor = Color.White,
            unselectedTextColor = Color.White,
            disabledIconColor = Color.Gray,
            disabledTextColor = Color.Gray
        )
    )
}