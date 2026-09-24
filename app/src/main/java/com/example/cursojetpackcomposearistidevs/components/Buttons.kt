package com.example.cursojetpackcomposearistidevs.components

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cursojetpackcomposearistidevs.R

@Composable
fun MyButtons(modifier: Modifier = Modifier) {

    Column(modifier = modifier) {

        Button(
            onClick = { Log.i("Sergio", "Botón pulsado") },
            enabled = false,
            shape = RoundedCornerShape(20),
            border = BorderStroke(2.dp, Color.Red),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Red,
                containerColor = Color.White,
                disabledContainerColor = Color.Yellow,
                disabledContentColor = Color.Green
            )
        ) {
            Text("Púlsame")
        }

        OutlinedButton(
            onClick = {}, colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Blue
            )
        ) {
            Text("Outlined")
        }

        TextButton(onClick = {}) {
            Text("Text button")
        }

        ElevatedButton(onClick = {}) {
            Text("Elevated button")
        }

        FilledTonalButton(onClick = {}) {
            Text("Elevated button")
        }
    }
}

@Preview
@Composable
fun MyFAB(modifier: Modifier = Modifier) {

    FloatingActionButton(
        onClick = {},
        shape = CircleShape,
        contentColor = Color.White,
        containerColor = Color.Red,
        elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 12.dp)
    ) {
        Icon(painter = painterResource(R.drawable.ic_add), contentDescription = null)

    }
}