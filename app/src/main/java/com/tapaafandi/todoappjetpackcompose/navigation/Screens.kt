package com.tapaafandi.todoappjetpackcompose.navigation

import androidx.navigation.NavHostController
import com.tapaafandi.todoappjetpackcompose.util.Action
import com.tapaafandi.todoappjetpackcompose.util.Constant.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}