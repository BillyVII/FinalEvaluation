package com.technopixl.finalevaluation.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class BaseService {
    val baseUrl = "https://api.themoviedb.org/3/"
    val apiKey = "b2168bae3a2c67509eb6b97572f521c2"

    val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}