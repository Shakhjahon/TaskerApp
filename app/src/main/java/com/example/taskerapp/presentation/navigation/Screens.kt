package com.example.taskerapp.presentation.navigation

import androidx.annotation.StringRes
import com.example.taskerapp.R

sealed class Screens(@StringRes val route: Int) {

    object MainScreen : Screens(R.string.route_main_screen)
    object AddTaskScreen : Screens(R.string.route_add_task_screen)
    object AddCatigoriyScreens : Screens(R.string.route_add_Catigoriy_screen)
}
