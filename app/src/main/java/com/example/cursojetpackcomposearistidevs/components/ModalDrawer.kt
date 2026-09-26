package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyModalDrawer(modifier: Modifier = Modifier, content: @Composable () -> Unit) {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text("Ejemplo 1")
                Text("Ejemplo 2")
                Text("Ejemplo 3")
                Text("Ejemplo 4")
            }
        },
        scrimColor = Color.Red
    ) {
        content()
    }
}