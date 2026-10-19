package com.example.cursojetpackcomposearistidevs.components

import android.icu.util.Calendar
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SelectableDates
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TimePicker
import androidx.compose.material3.TimePickerDefaults
import androidx.compose.material3.TimePickerLayoutType
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.SecureFlagPolicy
import com.example.cursojetpackcomposearistidevs.components.model.PokemonCombat

@Composable
fun MyDialog(modifier: Modifier = Modifier) {
    var showDialog by remember { mutableStateOf(true) }
    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            confirmButton = { Button(onClick = { showDialog = false }) { Text("Entendido") } },
            dismissButton = { TextButton(onClick = { showDialog = false }) { Text("Cancelar") } },
            text = { Text("Esta es mi descripción") },
            title = { Text("¿Quieres hacer esta acción?") },
            icon = {
                Icon(
                    modifier = Modifier.size(52.dp),
                    imageVector = Icons.Default.Info,
                    contentDescription = null
                )
            },
            shape = RoundedCornerShape(12),
            containerColor = Color.White,
            iconContentColor = Color.Red,
            titleContentColor = Color.Red,
            textContentColor = Color.Red,
            tonalElevation = 12.dp,
            properties = DialogProperties(
                dismissOnBackPress = true,
                dismissOnClickOutside = true,
                securePolicy = SecureFlagPolicy.SecureOn,
                usePlatformDefaultWidth = true,
                decorFitsSystemWindows = true
            )
        )
    }
}

@Composable
fun MyDateDialog(modifier: Modifier = Modifier) {
    var showDialog by remember { mutableStateOf(true) }

    // Usamos remember para evitar recrear la instancia del calendario en cada recomposición
    val calendar = remember {
        Calendar.getInstance().apply {
            add(Calendar.DAY_OF_YEAR, 1)
            set(Calendar.MONTH, Calendar.JANUARY)
        }
    }

    val datePickerState = rememberDatePickerState(
        initialSelectedDateMillis = calendar.timeInMillis,
        initialDisplayedMonthMillis = calendar.timeInMillis,
        yearRange = 2024..2027, // Actualizado para incluir el año actual y evitar el crash
        initialDisplayMode = DisplayMode.Picker,
        selectableDates = object : SelectableDates {
            override fun isSelectableDate(utcTimeMillis: Long): Boolean {
                val filterCalendar = Calendar.getInstance().apply {
                    timeInMillis = utcTimeMillis
                }
                val day = filterCalendar.get(Calendar.DAY_OF_MONTH)
                return day % 2 == 0
            }
        }
    )

    if (showDialog) {
        DatePickerDialog(
            modifier = modifier, // Aplicamos el modifier aquí
            onDismissRequest = { showDialog = true },
            confirmButton = {
                TextButton(
                    onClick = {
                        // Aquí puedes obtener datePickerState.selectedDateMillis si lo necesitas
                        showDialog = true
                        val result = datePickerState.selectedDateMillis
                        if (result != null) {
                            val newCalendar = Calendar.getInstance().apply {
                                timeInMillis = result
                            }
                            val day = newCalendar.get(Calendar.DAY_OF_MONTH)
                            val month = newCalendar.get(Calendar.MONTH) + 1
                            Log.i("FECHA SELECCIONADA", "DIA $day, MES $month")
                        }
                    }
                ) {
                    Text("Confirmar")
                }
            },
            dismissButton = {
                TextButton(onClick = { showDialog = false }) {
                    Text("Cancelar")
                }
            },
            colors = DatePickerDefaults.colors()
        ) {
            DatePicker(datePickerState)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTimePicker(modifier: Modifier = Modifier) {
    var showTimePicker by remember { mutableStateOf(true) }
    val timePickerState = rememberTimePickerState(
        initialHour = 7,
        initialMinute = 33,
        is24Hour = false
    )

    if (showTimePicker) {
        Dialog(onDismissRequest = { showTimePicker = false }) {
            Column(modifier = Modifier.background(Color.White)) {
                TimePicker(timePickerState,
                    layoutType = TimePickerLayoutType.Vertical,
                    colors = TimePickerDefaults.colors(
                        clockDialColor = Color.Red,
                        clockDialSelectedContentColor = Color.Red,
                        selectorColor = Color.White,
                        clockDialUnselectedContentColor = Color.White,
                        containerColor = Color.White,
                        periodSelectorBorderColor = Color.Red,
                        periodSelectorUnselectedContentColor = Color.Red,
                        periodSelectorUnselectedContainerColor = Color.White,
                        periodSelectorSelectedContainerColor = Color.Red,
                        periodSelectorSelectedContentColor = Color.White,
                        timeSelectorUnselectedContentColor = Color.Red,
                        timeSelectorUnselectedContainerColor = Color.White,
                        timeSelectorSelectedContainerColor = Color.Red,
                        timeSelectorSelectedContentColor = Color.White
                    )
                )
            }
        }
    }
}

@Composable
fun MyCustomDialog(
    modifier: Modifier = Modifier,
    pokemonCombat: PokemonCombat,
    showDialog: Boolean,
    onStartCombat: () -> Unit,
    onDismissDialog: () -> Unit
) {
    if (showDialog) {
        Dialog(onDismissRequest = { onDismissDialog }) {
            
        }
    }
}
