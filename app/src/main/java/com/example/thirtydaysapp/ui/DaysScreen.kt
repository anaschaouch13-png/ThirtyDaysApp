package com.example.thirtydaysapp.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.thirtydaysapp.model.DaysRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirtyDaysApp() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "30 Days App",
                        style = MaterialTheme.typography.headlineSmall,
                    )
                },
            )
        },
    ) { innerPadding ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.padding(innerPadding),
        ) {
            items(DaysRepository.daysList) { dayItem ->
                DayItemCard(
                    dayItem = dayItem,
                    modifier = Modifier.padding(bottom = 12.dp),
                )
            }
        }
    }
}
