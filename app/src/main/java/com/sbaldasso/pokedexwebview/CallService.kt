package com.sbaldasso.pokedexwebview

import com.sbaldasso.pokedexwebview.models.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CallService {
    @GET("/pokemon")
    suspend fun getPokemonList(): List<Pokemon>

    @GET("/pokemon/{id}")
   suspend fun getPokemonById(@Path("id") id: Int): Pokemon
}