package com.samaa.playwith.core.design.component;

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.samaa.playwith.feature.main.navigation.BottomLevelNavigation

/**
 * 底部导航栏
 */
@Composable
fun MyNavigationBar(
    destinations: List<BottomLevelNavigation>,
    onNavigateToDestination: (Int) -> Unit,
    currentDestination: String,
    modifier: Modifier = Modifier
): Unit {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .navigationBarsPadding()
//            .padding(10.dp)
    ) {
        destinations.forEachIndexed() { index, destination ->
            val selected = destination.route == currentDestination
            val color = if (selected)
                Color(0xFF131ECC)
            else
                Color(0xFFC8D1E1)

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f)
                    .clickable {
                        onNavigateToDestination(index)
                    }
                    .padding(top = 15.dp, bottom = 15.dp, start = 5.dp, end = 5.dp)
            ) {
                Image(
                    painter = painterResource(
                        id = if (selected) destination.selectIcon
                        else destination.unselectedIcon
                    ),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = stringResource(id = destination.titleTextId),
                    style = MaterialTheme.typography.bodySmall,
                    color = color
                )
            }
        }
    }


}
