package com.example.taskerapp.domein.reposetory

import com.example.taskerapp.data.models.TaskModel

interface TaskReposetory {

    fun AddNewTask(taskModel: TaskModel)

    fun getAllTasks():List<TaskModel>
}
