package com.example.cursojetpackcomposearistidevs.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.example.cursojetpackcomposearistidevs.R

@Composable
fun MyDropDownMenu(modifier: Modifier = Modifier) {

    var expanded by remember { mutableStateOf(false) }

    Box(modifier = modifier) {

        Button(onClick = { expanded = true }) {
            Text("Ver opciones")
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            offset = DpOffset(16.dp, 16.dp),
            properties = PopupProperties(
                focusable = true,
                dismissOnClickOutside = true,
                dismissOnBackPress = true,
                clippingEnabled = false
            )
        ) {
            DropdownMenuItem(text = { Text("Opción 1") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("Opción 2") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("Opción 3") }, onClick = { expanded = false })
            DropdownMenuItem(text = { Text("Opción 4") }, onClick = { expanded = false })
        }
    }
}

@Composable
fun MyDropDownItem(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        DropdownMenuItem(
            modifier = Modifier.fillMaxWidth(),
            text = {
                Text("Ejemplo 1")
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(android.R.drawable.ic_dialog_info),
                    contentDescription = ""
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_personita),
                    contentDescription = ""
                )
            },
            enabled = false,
            contentPadding = PaddingValues(16.dp),
            colors = MenuDefaults.itemColors(
                textColor = Color.Red,
                leadingIconColor = Color.Blue,
                trailingIconColor = Color.Green,
                disabledTextColor = Color.Yellow,
                disabledLeadingIconColor = Color.Yellow,
                disabledTrailingIconColor = Color.Yellow
            ),
            onClick = {})
    }
}