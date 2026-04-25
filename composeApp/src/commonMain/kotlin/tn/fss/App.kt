package tn.fss

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import tn.fss.screens.ScoreScreen
import tn.fss.screens.TeamCreationScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigator(TeamCreationScreen())
    }
}
