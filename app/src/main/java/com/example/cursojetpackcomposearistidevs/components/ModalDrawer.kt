package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Badge
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyModalDrawer(
    drawerState: DrawerState,
    content: @Composable () -> Unit
) {

    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                drawerShape = RoundedCornerShape(
                    topEndPercent = 16,
                    bottomEndPercent = 16,
                    bottomStartPercent = 0
                ),
                drawerContentColor = Color.Red,
                drawerContainerColor = Color.White,
                drawerTonalElevation = 10.dp
            ) {
                Spacer(Modifier.height(24.dp))
                NavigationDrawerItem(
                    label = { Text("Ejemplo 1") },
                    selected = false,
                    onClick = {},
                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = null) },
                    badge = { Badge { Text("3") } },
                    shape = RoundedCornerShape(0),
                    colors = NavigationDrawerItemDefaults.colors(
                        selectedContainerColor = Color.Red,
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White,
                        selectedBadgeColor = Color.Yellow,
                        unselectedContainerColor = Color.White,
                        unselectedTextColor = Color.Red,
                        unselectedBadgeColor = Color.Green,
                        unselectedIconColor = Color.Red
                    )
                )
                NavigationDrawerItem(
                    label = { Text("Ejemplo 2") },
                    selected = false,
                    onClick = {},
                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = null) },
                    badge = { Badge { Text("3") } },
                    shape = RoundedCornerShape(0),
                    colors = NavigationDrawerItemDefaults.colors(
                        selectedContainerColor = Color.Red,
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White,
                        selectedBadgeColor = Color.Yellow,
                        unselectedContainerColor = Color.White,
                        unselectedTextColor = Color.Red,
                        unselectedBadgeColor = Color.Green,
                        unselectedIconColor = Color.Red
                    )
                )
                NavigationDrawerItem(
                    label = { Text("Ejemplo 3") },
                    selected = true,
                    onClick = {},
                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = null) },
                    badge = { Badge(containerColor = Color.White, contentColor = Color.Red) { Text("3") } },
                    shape = RoundedCornerShape(0),
                    colors = NavigationDrawerItemDefaults.colors(
                        selectedContainerColor = Color.Red,
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White,
                        selectedBadgeColor = Color.Yellow,
                        unselectedContainerColor = Color.White,
                        unselectedTextColor = Color.Red,
                        unselectedBadgeColor = Color.Green,
                        unselectedIconColor = Color.Red
                    )
                )
            }
        },
        scrimColor = Color.Red.copy(alpha = 0.6f)
    ) {
        content()
    }
}