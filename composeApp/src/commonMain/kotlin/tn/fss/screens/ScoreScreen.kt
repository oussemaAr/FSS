package tn.fss.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import tn.fss.Res
import tn.fss.composables.TeamModel
import tn.fss.composables.TeamView
import tn.fss.refresh

@Composable
fun ScoreScreen() {
    val teamAScore = remember { mutableIntStateOf(0) }
    val teamBScore = remember { mutableIntStateOf(0) }
    Box {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            TeamView(
                team = TeamModel(
                    name = "Team A",
                    score = teamAScore.value,
                    color = Color.Cyan,
                ),
                modifier = Modifier.clickable {
                    teamAScore.value += 1
                })
            TeamView(
                team = TeamModel(
                    name = "TeamB",
                    score = teamBScore.value,
                    color = Color.DarkGray,
                ),
                modifier = Modifier.clickable {
                    teamBScore.value += 1
                })
        }
        Image(
            painterResource(
                Res.drawable.refresh
            ),
            modifier = Modifier.align(Alignment.Center)
                .size(48.dp)
                .clickable {
                    teamAScore.value = 0
                    teamBScore.value = 0
                },
            colorFilter = ColorFilter.tint(Color.White),
            contentDescription = ""
        )

    }
}
