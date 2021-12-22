package com.tapaafandi.todoappjetpackcompose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tapaafandi.todoappjetpackcompose.data.models.Priority
import com.tapaafandi.todoappjetpackcompose.data.models.ToDoTask
import com.tapaafandi.todoappjetpackcompose.util.Action

@Composable
fun TaskScreen(
    navigateToListScreen: (Action) -> Unit,
    selectedTask: ToDoTask?
) {
    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        },
        content = {
            TaskContent(
                title = "",
                onTitleChange = {},
                description = "",
                onDescriptionChange = {},
                priority = Priority.HIGH,
                onPrioritySelected = {}
            )
        },

        )
}