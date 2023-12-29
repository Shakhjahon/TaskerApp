package com.example.taskerapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.taskerapp.presentation.screen.screeen_main.MainScreen
import com.example.taskerapp.presentation.screen.screen_addTasc.AddTaskScreen
import com.example.taskerapp.presentation.screen.screen_add_catigoriy.AddTaskcatigoryScreen

@Composable
fun TasckNavigation() {

    val navController = rememberNavController()
    val mainScreenRoute = Screens.MainScreen.route.toString()
    val addTaskScreenRoute = Screens.AddTaskScreen.route.toString()
    val addCategoryTaskScreenRoute = Screens.AddCatigoriyScreens.route.toString()

    val addTask|ViewModel: AddTaskViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = mainScreenRoute,
    ){
        composable(mainScreenRoute){
            MainScreen(navController = navController)
        }
        composable(addCategoryTaskScreenRoute){
            AddTaskcatigoryScreen()
        }
        composable(addTaskScreenRoute){
            AddTaskScreen(
                navController = navController
Add
            )
        }
    }
}