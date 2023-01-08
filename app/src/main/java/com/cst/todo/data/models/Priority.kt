package com.cst.todo.data.models

import androidx.compose.ui.graphics.Color
import com.cst.todo.ui.theme.HighPriorityColor
import com.cst.todo.ui.theme.LowPriorityColor
import com.cst.todo.ui.theme.MediumPriorityColor
import com.cst.todo.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}