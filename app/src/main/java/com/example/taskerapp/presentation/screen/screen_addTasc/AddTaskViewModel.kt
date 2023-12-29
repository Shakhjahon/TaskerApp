package com.example.taskerapp.presentation.screen.screen_addTasc

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.taskerapp.R
import com.example.taskerapp.data.reposetoryImpl.TaskReposetoryImple
import com.example.taskerapp.domein.TaskUseCase.TaskUseCaseImpl
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow

class AddTaskViewModel: ViewModel() {

    private val taskReposetory = TaskReposetoryImple()
    private val addNewTaskUseCase = TaskUseCaseImpl(taskReposetory)

    private val _toastFlow =  MutableSharedFlow<Int>(1)
            val toastFlow = _toastFlow.asSharedFlow()

    var uiState by mutableStateOf(AddTaskUiState())

    fun addNewTask(uiState: AddTaskUiState){
        if (uiState.taskText.isBlank()) {
            _toastFlow.tryEmit(R.string.con)
        }
        if (uiState.taskDate.isBlank()){
            _toastFlow.tryEmit(R.string.cond)
        }
        if (uiState.taskTime.isBlank()){
            _toastFlow.tryEmit(R.string.cond)
        }
        if (uiState.cateegory.()){
            _toastFlow.tryEmit(R.string.cond)
        }

    }
}