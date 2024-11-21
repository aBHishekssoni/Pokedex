package com.abhishek_soni.pokedex.util

import android.graphics.Color
import com.abhishek_soni.pokedex.data.remote.response.Stat
import com.abhishek_soni.pokedex.data.remote.response.Type
import com.abhishek_soni.pokedex.ui.theme.AtkColor
import com.abhishek_soni.pokedex.ui.theme.DefColor
import com.abhishek_soni.pokedex.ui.theme.HPColor
import com.abhishek_soni.pokedex.ui.theme.SpAtkColor
import com.abhishek_soni.pokedex.ui.theme.SpDefColor
import com.abhishek_soni.pokedex.ui.theme.SpdColor
import com.abhishek_soni.pokedex.ui.theme.TypeBug
import com.abhishek_soni.pokedex.ui.theme.TypeDark
import com.abhishek_soni.pokedex.ui.theme.TypeDragon
import com.abhishek_soni.pokedex.ui.theme.TypeElectric
import com.abhishek_soni.pokedex.ui.theme.TypeFairy
import com.abhishek_soni.pokedex.ui.theme.TypeFighting
import com.abhishek_soni.pokedex.ui.theme.TypeFire
import com.abhishek_soni.pokedex.ui.theme.TypeFlying
import com.abhishek_soni.pokedex.ui.theme.TypeGhost
import com.abhishek_soni.pokedex.ui.theme.TypeGrass
import com.abhishek_soni.pokedex.ui.theme.TypeGround
import com.abhishek_soni.pokedex.ui.theme.TypeIce
import com.abhishek_soni.pokedex.ui.theme.TypeNormal
import com.abhishek_soni.pokedex.ui.theme.TypePoison
import com.abhishek_soni.pokedex.ui.theme.TypePsychic
import com.abhishek_soni.pokedex.ui.theme.TypeRock
import com.abhishek_soni.pokedex.ui.theme.TypeSteel
import com.abhishek_soni.pokedex.ui.theme.TypeWater
import java.util.Locale


fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.toLowerCase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}