package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.SliderState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MySlider(modifier: Modifier = Modifier) {
    var myValue by remember { mutableFloatStateOf(0f) }
    Column(modifier = modifier.padding(horizontal = 30.dp)) {
        Slider(
            value = myValue,
            onValueChange = { myValue = it },
            colors = SliderDefaults.colors()
        )
        Text(myValue.toString())

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MySliderAdvance(modifier: Modifier = Modifier) {
    var example by remember { mutableStateOf(":(") }
    val state = remember {
        SliderState(
            value = 5f,
            valueRange = 0f..10f,
            steps = 9,
            onValueChangeFinished = { example = "FELIZ" }
        )
    }

    val colors = SliderDefaults.colors(
        thumbColor = Color.Red,
        disabledThumbColor = Color.DarkGray,
        activeTrackColor = Color.Red,
        activeTickColor = Color.Blue,
        disabledActiveTrackColor = Color.Gray,
        disabledActiveTickColor = Color.DarkGray,
        inactiveTrackColor = Color.Blue,
        inactiveTickColor = Color.Green,
        disabledInactiveTickColor = Color.DarkGray,
        disabledInactiveTrackColor = Color.Gray
    )

    Column(modifier = modifier.padding(horizontal = 32.dp)) {
        Slider(state, colors = colors, thumb = { state: SliderState -> Text(state.value.toString()) })
        Text(example)
    }

}