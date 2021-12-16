package com.tapaafandi.todoappjetpackcompose.data.models

import androidx.compose.ui.graphics.Color
import com.tapaafandi.todoappjetpackcompose.ui.theme.HighPriorityColor
import com.tapaafandi.todoappjetpackcompose.ui.theme.LowPriorityColor
import com.tapaafandi.todoappjetpackcompose.ui.theme.MediumPriorityColor
import com.tapaafandi.todoappjetpackcompose.ui.theme.NonePriorityColor


enum class Priority(
    val color: Color
) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}