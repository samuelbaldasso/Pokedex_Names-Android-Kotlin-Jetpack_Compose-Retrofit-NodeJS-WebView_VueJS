package com.sbaldasso.pokedexwebview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.MaterialTheme
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Surface
import androidx.compose.ui.tooling.preview.Preview
import com.sbaldasso.pokedexwebview.models.Pokemon
import com.sbaldasso.pokedexwebview.models.PokemonViewModel
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.viewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                MaterialTheme{
                    PokemonScreen()
                    // WebViewComponent("http://192.168.0.103:8080")
                }
            }
        }
}