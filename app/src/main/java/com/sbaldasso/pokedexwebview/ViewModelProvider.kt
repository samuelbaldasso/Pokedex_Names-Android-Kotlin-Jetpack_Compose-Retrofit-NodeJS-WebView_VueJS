package com.sbaldasso.pokedexwebview

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sbaldasso.pokedexwebview.models.Pokemon
import com.sbaldasso.pokedexwebview.models.PokemonViewModel

class PokemonViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PokemonViewModel::class.java)) {
            return PokemonViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}