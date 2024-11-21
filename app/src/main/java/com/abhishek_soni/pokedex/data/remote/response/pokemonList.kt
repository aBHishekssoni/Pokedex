package com.abhishek_soni.pokedex.data.remote.response

data class pokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)