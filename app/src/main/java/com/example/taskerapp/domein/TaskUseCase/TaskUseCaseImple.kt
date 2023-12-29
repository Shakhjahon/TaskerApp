package com.example.taskerapp.domein.TaskUseCase

import com.example.taskerapp.data.models.TaskModel
import com.example.taskerapp.data.reposetoryImpl.TaskReposetoryImple
import com.example.taskerapp.domein.reposetory.TaskReposetory

class TaskUseCaseImpl(
     val taskReposetory: TaskReposetory
): TaskUseCase {

    override suspend fun getAllTask(taskModel: TaskModel) {
        TODO("Not yet implemented")
    }

    override suspend fun AddNewTask(taskModel: TaskModel) {
        TODO("Not yet implemented")
    }
}