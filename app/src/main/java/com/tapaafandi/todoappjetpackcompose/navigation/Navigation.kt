package com.tapaafandi.todoappjetpackcompose.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tapaafandi.todoappjetpackcompose.navigation.destinations.listComposable
import com.tapaafandi.todoappjetpackcompose.navigation.destinations.taskComposable
import com.tapaafandi.todoappjetpackcompose.ui.viewmodels.SharedViewModel
import com.tapaafandi.todoappjetpackcompose.util.Constant.LIST_SCREEN

@ExperimentalMaterialApi
@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }
    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }

}