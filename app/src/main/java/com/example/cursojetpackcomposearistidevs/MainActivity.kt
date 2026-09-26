package com.example.cursojetpackcomposearistidevs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.cursojetpackcomposearistidevs.components.MyFAB
import com.example.cursojetpackcomposearistidevs.components.MyModalDrawer
import com.example.cursojetpackcomposearistidevs.components.MyNavigationBar
import com.example.cursojetpackcomposearistidevs.components.MyTopAppBar
import com.example.cursojetpackcomposearistidevs.login.Greeting
import com.example.cursojetpackcomposearistidevs.ui.theme.CursoJetpackComposeAristiDevsTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CursoJetpackComposeAristiDevsTheme {
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                val snackbarHostState = remember { SnackbarHostState() }
                val scope = rememberCoroutineScope()

                var texto by remember { mutableStateOf("Esta es mi screen") }

                MyModalDrawer(drawerState) {
                    Scaffold(
                        modifier = Modifier.fillMaxSize(),
                        topBar = { MyTopAppBar { scope.launch { drawerState.open() } } },
                        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
                        floatingActionButton = { MyFAB() },
                        floatingActionButtonPosition = FabPosition.Start,
                        bottomBar = { MyNavigationBar() }
                    )
                    { innerPadding ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(innerPadding)
                                .background(Color.Cyan),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = texto, modifier = Modifier.clickable {
                                scope.launch {
                                    val result = snackbarHostState.showSnackbar(
                                        message = "Ejemplo",
                                        actionLabel = "Deshacer"
                                    )

                                    if (result == SnackbarResult.ActionPerformed) {
                                        // Pulsó deshacer
                                        texto = "¡Pulsaste el botón Deshacer!"

                                    } else {
                                        // No hizo nada
                                    }
                                }
                            })
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CursoJetpackComposeAristiDevsTheme {
        Greeting("Android")
    }
}