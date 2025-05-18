package com.example.mewnfo.presentation.ui.view.breeds

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ScreenBreeds(
    breedsNames: List<String>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
    ) {
        LazyColumn {
            items(
                items = breedsNames,
                itemContent = {
                    ItemBreeds(name = it)
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenBreedsPreview() {
    ScreenBreeds(
        breedsNames = emptyList(),
    )
}