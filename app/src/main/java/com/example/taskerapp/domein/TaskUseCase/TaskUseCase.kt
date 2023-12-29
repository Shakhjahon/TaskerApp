package com.example.taskerapp.domein.TaskUseCase

import com.example.taskerapp.data.models.TaskModel

interface TaskUseCase {
    suspend fun getAllTask(taskModel: TaskModel)
    suspend fun AddNewTask(taskModel: TaskModel)
}