package com.abhishek_soni.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.abhishek_soni.pokedex.data.remote.response.pokemon
import com.abhishek_soni.pokedex.repository.PokemonRepository
import com.abhishek_soni.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class PokemonDetailViewModel {

    @HiltViewModel
    class PokemonDetailViewModel @Inject constructor(
        private val repository: PokemonRepository
    ) : ViewModel() {

        suspend fun getPokemonInfo(pokemonName: String): Resource<pokemon> {
            return repository.getPokemonInfo(pokemonName)
        }
    }
}