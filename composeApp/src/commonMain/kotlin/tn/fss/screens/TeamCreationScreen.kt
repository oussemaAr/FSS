package tn.fss.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun TeamCreationScreen() {
    val teamOneName = remember { mutableStateOf("") }
    val teamTwoName = remember { mutableStateOf("") }
    val maxWidthModifier = Modifier
        .fillMaxWidth()
    Column(
        modifier = maxWidthModifier
            .windowInsetsPadding(WindowInsets.systemBars)
    ) {
        TextField(
            value = teamOneName.value,
            modifier = maxWidthModifier,
            onValueChange = {
                teamOneName.value = it
            }
        )
        TextField(
            value = teamTwoName.value,
            modifier = maxWidthModifier,
            onValueChange = {
                teamTwoName.value = it
            }
        )

        Button(
            modifier = maxWidthModifier,
            onClick = {

            }) {
            Text("Click Me")
        }
    }
}