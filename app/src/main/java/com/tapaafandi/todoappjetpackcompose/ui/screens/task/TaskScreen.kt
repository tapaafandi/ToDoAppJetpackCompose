package com.tapaafandi.todoappjetpackcompose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.tapaafandi.todoappjetpackcompose.util.Action

@Composable
fun TaskScreen(
    navigateToListScreen: (Action) -> Unit
) {

    Scaffold(
        topBar = {
            TaskAppBar(navigateToListScreen = navigateToListScreen)
        },
        content = {},

    )
}