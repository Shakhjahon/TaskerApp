package com.example.taskerapp.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskerapp.R
import com.example.taskerapp.presentation.theme.TaskerBlue
import com.example.taskerapp.presentation.theme.dp64

@Preview
@Composable
fun FABPriview() {
    MaterialTheme {
        FabComponent(
            onNavigatyCreatyScreen = {}
        )
    }
}

@Composable
fun FabComponent(
    modifier: Modifier = Modifier,
    onNavigatyCreatyScreen: (isTask: Boolean) -> Unit,

    ) {
    var isClick by remember {
        mutableStateOf(false)
    }
    Column {
        if (isClick) DropDownMenu(
            onDismissMenu = {
                isClick = false
            },
        ) { isTask ->
            onNavigatyCreatyScreen(isTask)
        }
        Card(
            shape = CircleShape, modifier = Modifier.size(dp64)
        ) {
            Box(
                modifier = modifier
                    .fillMaxSize()
                    .background(
                        if (isClick) TaskerBlue else Color.White
                    )
                    .clickable {
                        isClick = !isClick
                    },
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    painter = painterResource(
                        if (isClick) R.drawable.ikes else R.drawable.plus
                    ), contentDescription = null, tint = if (isClick) Color.White else TaskerBlue
                )
            }
        }
    }
}