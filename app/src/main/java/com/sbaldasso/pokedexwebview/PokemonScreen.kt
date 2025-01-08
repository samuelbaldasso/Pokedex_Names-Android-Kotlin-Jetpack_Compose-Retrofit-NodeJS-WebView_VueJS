package com.sbaldasso.pokedexwebview

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.collectLatest
import com.sbaldasso.pokedexwebview.models.Pokemon
import com.sbaldasso.pokedexwebview.models.PokemonViewModel
import kotlinx.coroutines.flow.asFlow
import java.util.Locale

@Composable
fun PokemonScreen() {
    val pokemonViewModel: PokemonViewModel = viewModel()

    val pokemonList by pokemonViewModel.pokemon.collectAsState()

    LaunchedEffect(Unit) {
        pokemonViewModel.fetchPokemons()
    }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
                items(pokemonList) { pokemon ->
                    Column {
                        Text(
                            text = "Name: ${pokemon.name.uppercase()}",
                            style = TextStyle(color = Color.Black),
                            modifier = Modifier.padding(8.dp)
                        )
                        Divider(color = Color.Gray)
                    }
                }

            }
        }
}