package com.tapaafandi.todoappjetpackcompose.navigation

import androidx.navigation.NavHostController
import com.tapaafandi.todoappjetpackcompose.util.Action
import com.tapaafandi.todoappjetpackcompose.util.Constant.LIST_SCREEN
import com.tapaafandi.todoappjetpackcompose.util.Constant.SPLASH_SCREEN

class Screens(navController: NavHostController) {
    val splash: () -> Unit = {
        navController.navigate(route = "list/${Action.NO_ACTION.name}") {
            popUpTo(SPLASH_SCREEN) { inclusive = true }
        }
    }
    val list: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId")
    }
    val task: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

}