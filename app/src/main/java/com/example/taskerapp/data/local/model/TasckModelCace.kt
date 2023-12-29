package com.example.taskerapp.data.local.model

import androidx.compose.ui.graphics.Color
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

private const val TASK_TABLE_NAME = "task_table_name"
private const val TASK_DATE = "task_date"
private const val TASK_TIME = "task_time"
private const val TASK_CATEGORY_ID = "task_category_id"
private const val TASK_ID = "task_Id"

@Entity(tableName = TASK_TABLE_NAME)
data class TaskModelCache(
    @PrimaryKey val taskId: String,
    @ColumnInfo(name = TASK_ID) val taskText: String,
    @ColumnInfo(name = TASK_DATE) val taskData: Color,
    @ColumnInfo(name = TASK_TIME) val taskTime: Color,
    @ColumnInfo(name = TASK_CATEGORY_ID) val categoryId: String,
)
