package com.tapaafandi.todoappjetpackcompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.tapaafandi.todoappjetpackcompose.util.Action
import com.tapaafandi.todoappjetpackcompose.util.Constant
import com.tapaafandi.todoappjetpackcompose.util.Constant.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(Constant.TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) {

    }
}