package com.sbaldasso.pokedexwebview.models;

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sbaldasso.pokedexwebview.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonViewModel : ViewModel() {
        private val _pokemon = MutableStateFlow<List<Pokemon>>(emptyList())
        val pokemon: StateFlow<List<Pokemon>> = _pokemon

        fun fetchPokemons() {
            viewModelScope.launch {
                val pokemonList = RetrofitClient.apiService.getPokemonList()
                _pokemon.value = pokemonList
            }
        }
}