package com.example.mewnfo.presentation.component

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.mewnfo.presentation.ui.theme.MewnfoTheme
import com.example.mewnfo.presentation.ui.view.breeds.ScreenBreeds
import com.example.mewnfo.presentation.viewmodel.breeds.BreedsViewModel
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var breedsViewModel: BreedsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MewnfoApp).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MewnfoTheme {
                ScreenBreeds(breedsViewModel.fetchAllBreeds())
            }
        }
    }
}