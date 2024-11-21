package com.abhishek_soni.pokedex.repository

import com.abhishek_soni.pokedex.data.remote.PokeApi
import com.abhishek_soni.pokedex.data.remote.response.pokemon
import com.abhishek_soni.pokedex.data.remote.response.pokemonList
import com.abhishek_soni.pokedex.util.Resouse
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
){
    suspend fun getPokemonList(limit: Int, offset: Int): Resouse<pokemonList> {
        val reponse = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resouse.Error("An unknown error occured.")
        }
        return Resouse.Success(reponse)

    }
    suspend fun getPokemonInfo(pokemonName: String): Resouse<pokemon> {
        val reponse = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Resouse.Error("An unknown error occured.")
        }
        return Resouse.Success(reponse)

    }
}