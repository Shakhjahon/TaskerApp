package com.example.taskerapp.presentation.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskerapp.data.models.CategoryModel
import com.example.taskerapp.data.models.TaskModel
import com.example.taskerapp.presentation.screen.screen_addTasc.CategoryList
import com.example.taskerapp.presentation.theme.dp12
import com.example.taskerapp.presentation.theme.dp96


@Composable
fun CategoryLazyColumn(
) {
//    CategoryList()
}


@Composable
fun CotigoryList(
    categoryList: List<CategoryModel>

) {
    LazyColumn {
        items(
            items = categoryList,
            key = { item -> item.id }
        ) {

        }
    }
}

@Preview
@Composable
fun MainItem() {
    @Composable
    fun CategoryItem(
        categoryItem: TaskModel
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(dp96),
        ) {
            Text(
                modifier = Modifier.padding(top = dp12, start = dp12),
                text = categoryItem.taskTitle,
                fontSize = 16.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(700),
                color = MaterialTheme.colorScheme.onBackground,
            )
        }
    }
}

