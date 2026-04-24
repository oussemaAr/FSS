package tn.fss

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fss.composeapp.generated.resources.Res
import fss.composeapp.generated.resources.refresh
import org.jetbrains.compose.resources.painterResource

@Composable
@Preview
fun App() {
    val teamAScore = mutableIntStateOf(0)
    val teamBScore = mutableIntStateOf(0)
    MaterialTheme {
        Box {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                TeamView(
                    teamName = "Team A",
                    score = teamAScore.value,
                    color = Color.Cyan,
                    modifier = Modifier.clickable {
                        teamAScore.value += 1
                        print(teamAScore.toString())
                    })
                TeamView(
                    teamName = "TeamB",
                    score = teamBScore.value,
                    color = Color.DarkGray,
                    modifier = Modifier.clickable {
                        teamBScore.value += 1
                        print(teamBScore.toString())
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
}

@Composable
fun ColumnScope.TeamView(teamName: String, score: Int, color: Color, modifier: Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.background(color)
            .fillMaxWidth()
            .weight(1f)
    ) {
        Text(
            teamName, style = TextStyle(
                fontSize = 44.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFF0000)
            )
        )
        Text(
            score.toString(), style = TextStyle(
                fontSize = 80.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFF0000)
            )
        )
    }
}