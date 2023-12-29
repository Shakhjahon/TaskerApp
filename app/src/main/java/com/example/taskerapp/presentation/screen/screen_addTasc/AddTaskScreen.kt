package com.example.taskerapp.presentation.screen.screen_addTasc

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.taskerapp.R
import com.example.taskerapp.data.models.CategoryModel
import com.example.taskerapp.presentation.component.CircleColorComponent
import com.example.taskerapp.presentation.component.CostomDatePicker
import com.example.taskerapp.presentation.component.CostomTimePicker
import com.example.taskerapp.presentation.screen.screen_addTasc.model.AddTasckBottomMenuActions
import com.example.taskerapp.presentation.theme.EMPTY_STRING
import com.example.taskerapp.presentation.theme.TaskerBlue
import com.example.taskerapp.presentation.theme.TaskerGrey
import com.example.taskerapp.presentation.theme.dp10
import com.example.taskerapp.presentation.theme.dp14
import com.example.taskerapp.presentation.theme.dp16
import com.example.taskerapp.presentation.theme.dp25
import com.example.taskerapp.presentation.theme.dp5
import com.example.taskerapp.presentation.theme.dp6
import com.example.taskerapp.presentation.theme.sp18

@Preview
@Composable
fun AddTaskScreenPreview() {
    MaterialTheme {
//        AddTaskScreen(navController = rememberNavController())
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddTaskScreen(
    viewModel: AddTaskViewModel,
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    var bottomMenuClickStata by remember {
        mutableStateOf(AddTasckBottomMenuActions.DEFULT)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    TextButton(
                        onClick = {
            viewModel
                        },
                    ) {
                        Text(
                            text = stringResource(id = R.string.cancel),
                            color = TaskerBlue,
                            fontSize = sp18,
                            fontWeight = FontWeight(400),
                        )
                    }
                },
                actions = {
                    TextButton(
                        onClick = {

                        },
                    ) {
                        Text(
                            text = stringResource(id = R.string.done),
                            color = TaskerBlue,
                            fontSize = sp18,
                            fontWeight = FontWeight(600),
                        )
                    }
                },
            )
        },
    ) { innerPadding ->
        Column(
            modifier = modifier.padding(innerPadding)
        ) {
            TaskTextField()
            Spacer(modifier = modifier.weight(1f))
            TaskBottomMenu() {
                bottomMenuClickStata = it
            }
            AnimatedVisibility(visible = bottomMenuClickStata == AddTasckBottomMenuActions.CHOSEMENU) {
                CategoryList(
                    categoryList = listOf(
                        CategoryModel(
                            id = 1,
                            categoryTitle = "Work"
                        ),
                        CategoryModel(
                            id = 2,
                            categoryTitle = "Work"
                        ),
                        CategoryModel(
                            id = 3,
                            categoryTitle = "Work"
                        ),
                        CategoryModel(
                            id = 4,
                            categoryTitle = "Work"
                        ),
                        CategoryModel(
                            id = 5,
                            categoryTitle = "Work"
                        ),
                    )
                )
            }
            AnimatedVisibility(
                visible = bottomMenuClickStata == AddTasckBottomMenuActions.DATEPACKER
            ) {
                CostomDatePicker()
            }
            AnimatedVisibility(
                visible = bottomMenuClickStata == AddTasckBottomMenuActions.TIMEPECKER
            ) {
                CostomTimePicker()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskTextField(
    modifier: Modifier = Modifier,
) {
    var textFieldStata by remember {
        mutableStateOf(EMPTY_STRING)
    }
    Box(
        modifier = modifier.fillMaxWidth()
    ) {
        Column {
            Row(
                modifier = modifier
            ) {
                IconButton(
                    onClick = {

                    },
                ) {
                    Icon(
                        modifier = modifier.padding(start = dp6, top = dp6),
                        painter = painterResource(id = R.drawable.unmarked),
                        contentDescription = null,
                        tint = if (isSystemInDarkTheme()) Color.White
                        else TaskerGrey
                    )
                }
                TextField(
                    modifier = modifier.fillMaxWidth(),
                    value = textFieldStata,
                    onValueChange = {
                        textFieldStata = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = MaterialTheme.colorScheme.background,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.what_do_you_want_to_do),
                            fontSize = sp18,
                            fontWeight = FontWeight(500),
                            color = if (isSystemInDarkTheme()) Color.White
                            else TaskerGrey
                        )
                    },
                )
            }
        }
    }
}

@Composable
fun TaskBottomMenu(
    modifier: Modifier = Modifier,
    onClick: (AddTasckBottomMenuActions) -> Unit,
) {
    Divider()
    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        IconButton(
            modifier = modifier.padding(start = dp14, top = dp10),
            onClick = {
                onClick(AddTasckBottomMenuActions.DATEPACKER)
            },
        ) {
            Icon(
                painter = painterResource(id = R.drawable.calendar),
                contentDescription = null,
                tint = if (isSystemInDarkTheme()) Color.White
                else Color.Gray
            )
        }
        IconButton(
            modifier = modifier.padding(start = dp6, top = dp10),
            onClick = {
                onClick(AddTasckBottomMenuActions.TIMEPECKER)
            },
        ) {
            Icon(
                painter = painterResource(id = R.drawable.alarm),
                contentDescription = null,
                tint = if (isSystemInDarkTheme()) Color.White
                else Color.Gray
            )
        }
        Spacer(modifier = modifier.weight(1f))
        TextButton(
            modifier = Modifier.padding(top = dp5, end = dp5),
            onClick = {
                onClick(AddTasckBottomMenuActions.CHOSEMENU)
            },
        ) {

            Text(
                text = stringResource(id = R.string.inbox),
                fontSize = sp18,
                fontWeight = FontWeight.Bold,
                color = if (isSystemInDarkTheme()) Color.White
                else TaskerGrey,

                )
        }

        CircleColorComponent(
            modifier = modifier
                .padding(top = dp25, end = dp16)
                .size(12.dp),
            color = TaskerBlue,
        )
    }
}