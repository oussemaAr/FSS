package tn.fss.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun ColumnScope.TeamView(
    team: TeamModel,
    modifier: Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.background(team.color)
            .fillMaxWidth()
            .weight(1f)
    ) {
        Text(
            team.name, style = TextStyle(
                fontSize = 44.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFF0000)
            )
        )
        Text(
            team.score.toString(), style = TextStyle(
                fontSize = 80.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFF0000)
            )
        )
    }
}