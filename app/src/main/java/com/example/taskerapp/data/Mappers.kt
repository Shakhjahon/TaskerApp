package com.example.taskerapp.data

import com.example.taskerapp.data.local.model.TaskModelCache
import com.example.taskerapp.data.models.TaskModel

fun TaskModel.toCache() = TaskModelCache(
    taskId = taskId,
    taskText = taskText,
    taskData = taskData,
    taskTime = taskTime,
    categoryId = categoryId,
)

fun TaskModelCache.toDataModel() = TaskModel(
    taskId = taskId,
    taskText = taskText,
    taskData = taskData,
    taskTime = taskTime,
    categoryId = categoryId,
)