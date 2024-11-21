package com.abhishek_soni.pokedex.util

sealed class Resouse<T>(val data: T?= null,val message: String?= null){
    class Success<T>(data: T) : Resouse<T>(data)
    class Error<T>(message: String, data: T? = null) : Resouse<T>(data, message)
    class Loading<T> (data: T? = null) : Resouse<T>(data)

}