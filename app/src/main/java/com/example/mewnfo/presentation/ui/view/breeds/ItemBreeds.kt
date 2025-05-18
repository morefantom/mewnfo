package com.example.mewnfo.presentation.ui.view.breeds

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ItemBreeds(
    name: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
    ) {
        Text(text = name)
    }
}

@Preview
@Composable
fun ItemBreedsPreview() {
    ItemBreeds(
        name = "Turkish Angora",
    )
}