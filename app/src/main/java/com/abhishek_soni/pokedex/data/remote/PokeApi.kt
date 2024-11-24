package com.abhishek_soni.pokedex.data.remote

import com.abhishek_soni.pokedex.data.remote.response.pokemon
import com.abhishek_soni.pokedex.data.remote.response.pokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): pokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name: String
    ): pokemon
}