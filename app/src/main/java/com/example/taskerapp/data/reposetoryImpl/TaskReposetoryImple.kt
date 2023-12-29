package com.example.taskerapp.data.reposetoryImpl

import com.example.taskerapp.data.models.TaskModel
import com.example.taskerapp.data.toCache
import com.example.taskerapp.data.toDataModel
import com.example.taskerapp.domein.reposetory.TaskReposetory
import com.example.taskerapp.presentation.App

class TaskReposetoryImple : TaskReposetory {

   private val dao = App.databae.getTaskDao()

    override fun AddNewTask(taskModel: TaskModel) {
        dao.addNewTask(
            taskModelCache = taskModel.toCache()
        )
    }

    override fun getAllTasks(): List<TaskModel> {
        return dao.getAlltask().map {
            it.toDataModel()
        }
    }
}