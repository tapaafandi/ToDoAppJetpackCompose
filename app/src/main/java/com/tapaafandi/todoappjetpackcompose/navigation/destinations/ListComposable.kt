package com.tapaafandi.todoappjetpackcompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.tapaafandi.todoappjetpackcompose.ui.screens.list.ListScreen
import com.tapaafandi.todoappjetpackcompose.util.Constant.LIST_ARGUMENT_KEY
import com.tapaafandi.todoappjetpackcompose.util.Constant.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {
        ListScreen(navigateToTaskScreen = navigateToTaskScreen)
    }
}