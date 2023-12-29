package com.example.taskerapp.data.models

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.collect.ImmutableList

data class TaskModel(
    val taskId: String,
    val taskText: String,
    val taskData: Color,
    val taskTime: Color,
    val categoryId: String

)
@Immutable
data class CategoryModel(
    val categoryTitle: String,
    val id: Int,
//    val tasks: ImmutableList<TaskModel>
)
