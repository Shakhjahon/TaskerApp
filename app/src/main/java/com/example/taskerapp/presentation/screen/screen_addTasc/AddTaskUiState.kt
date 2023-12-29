package com.example.taskerapp.presentation.screen.screen_addTasc

import com.example.taskerapp.data.models.CategoryModel

data class AddTaskUiState {
    var taskText: String = String()
    var taskDate: String = String()
    var taskTime: String = String()
    var cateegory: CategoryModel? = null
    var taskCategioryList:  List<CategoryModel>? = emptyList()

}