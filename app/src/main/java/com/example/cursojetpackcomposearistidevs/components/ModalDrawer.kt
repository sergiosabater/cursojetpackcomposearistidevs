package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.launch

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
                    topEndPercent = 50,
                    bottomEndPercent = 50,
                    bottomStartPercent = 0
                )
            ) {
                Text(
                    "Ejemplo 1",
                    modifier = Modifier.clickable { scope.launch { drawerState.close() } })
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