package com.example.taskerapp.presentation.screen.screeen_main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.taskerapp.R
import com.example.taskerapp.presentation.component.TaskerScaffold

@Composable
fun MainScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    TaskerScaffold(title = stringResource(id = R.string.today),
        actionIcon = painterResource(id = R.drawable.more),
        isFloatingVisible = true,
        navController = navController,
        contentCallBack = { innerPadding -> })
}