package com.tapaafandi.todoappjetpackcompose.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.tapaafandi.todoappjetpackcompose.navigation.destinations.listComposable
import com.tapaafandi.todoappjetpackcompose.navigation.destinations.splashComposable
import com.tapaafandi.todoappjetpackcompose.navigation.destinations.taskComposable
import com.tapaafandi.todoappjetpackcompose.ui.viewmodels.SharedViewModel
import com.tapaafandi.todoappjetpackcompose.util.Constant.SPLASH_SCREEN

@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }
    AnimatedNavHost(
        navController = navController,
        startDestination = SPLASH_SCREEN
    ) {
        splashComposable(
            navigateToListScreen = screen.splash
        )
        listComposable(
            navigateToTaskScreen = screen.list,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
    }

}