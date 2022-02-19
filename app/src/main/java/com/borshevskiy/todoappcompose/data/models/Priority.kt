package com.borshevskiy.todoappcompose.data.models

import androidx.compose.ui.graphics.Color
import com.borshevskiy.todoappcompose.ui.theme.HighPriorityColor
import com.borshevskiy.todoappcompose.ui.theme.LowPriorityColor
import com.borshevskiy.todoappcompose.ui.theme.MediumPriorityColor
import com.borshevskiy.todoappcompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}