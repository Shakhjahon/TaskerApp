package com.example.taskerapp.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskerapp.R
import com.example.taskerapp.presentation.theme.TaskerBlue
import com.example.taskerapp.presentation.theme.dp20
import com.example.taskerapp.presentation.theme.dp22
import com.example.taskerapp.presentation.theme.dp30
import com.example.taskerapp.presentation.theme.sp26

@Preview
@Composable
fun CostomTimePckerPreview() {
    CostomTimePicker()
}

@Composable
fun CostomTimePicker() {
    Column {
        Spacer(modifier = Modifier.height(dp30))

        TimePickerUtil(
            height = 200.dp
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dp22),
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = TaskerBlue,
            )
        ) {
            Text(
                text = stringResource(R.string.confirm),
                fontSize = 15.sp,
                fontWeight = FontWeight.W500,
                color = Color.White
            )
        }
    }
}

@Composable
fun TimePickerUtil(
    height: Dp
) {

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .height(height),


        ) {
        InfiniteItemsPicker(
            items = hours,
            firstIndex = 0,
            onItemSelected = {},
            textStyle = MaterialTheme.typography.titleLarge.copy(
                fontSize = sp26,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onBackground,
            ),
        )
        InfiniteItemsPicker(
            items = minutes,
            firstIndex = 0,
            onItemSelected = {},
            textStyle = MaterialTheme.typography.titleLarge.copy(
                fontSize = sp26,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onBackground,
            )
        )
    }
}
