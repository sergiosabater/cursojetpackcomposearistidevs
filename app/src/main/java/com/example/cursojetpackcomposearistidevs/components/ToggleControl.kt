package com.example.cursojetpackcomposearistidevs.components


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cursojetpackcomposearistidevs.components.state.CheckBoxState

@Composable
fun MySwitch(modifier: Modifier = Modifier) {

    var switchState by remember { mutableStateOf(true) }

    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Switch(
            checked = switchState,
            onCheckedChange = { switchState = it },
            thumbContent = { Text("A") },
            enabled = true,
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Red,
                uncheckedThumbColor = Color.Blue,
                disabledCheckedThumbColor = Color.Yellow,
                disabledUncheckedThumbColor = Color.Green
            )
        )

    }
}

@Composable
fun MyCheckBox(modifier: Modifier = Modifier) {

    var state by remember { mutableStateOf(true) }

    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Checkbox(
                checked = state,
                onCheckedChange = { state = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Red,
                    checkmarkColor = Color.DarkGray
                )
            )

            Spacer(Modifier.width(5.dp))

            Text("Acepto los términos y condiciones")

        }
    }
}

@Composable
fun ParentCheckBoxes(modifier: Modifier = Modifier) {

    var state by remember {
        mutableStateOf(
            listOf(
                CheckBoxState(id = "terms", label = "Aceptar los términos y condiciones"),
                CheckBoxState(id = "newsletters", label = "Recibir la newsletter", true),
                CheckBoxState(id = "updates", label = "Recibir actualizaciones"),
            )
        )
    }

    Column(modifier = modifier.fillMaxSize()) {
        state.forEach { myState ->
            CheckBoxWithText(checkBoxState = myState) {
                state = state.map {
                    if (it.id == myState.id) {
                        myState.copy(checked = !myState.checked)
                    } else {
                        it
                    }
                }
            }
        }
    }
}

@Composable
fun CheckBoxWithText(
    modifier: Modifier = Modifier,
    checkBoxState: CheckBoxState,
    onCheckedChange: (CheckBoxState) -> Unit
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.clickable { onCheckedChange(checkBoxState) }) {
        Checkbox(
            checked = checkBoxState.checked,
            onCheckedChange = { onCheckedChange(checkBoxState) },
            enabled = true,
        )
        Spacer(Modifier.width(12.dp))
        Text(checkBoxState.label)
    }
}
