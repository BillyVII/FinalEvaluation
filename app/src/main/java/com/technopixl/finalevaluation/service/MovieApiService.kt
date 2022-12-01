package com.technopixl.finalevaluation.service

import com.technopixl.finalevaluation.model.MovieResult
import retrofit2.Response

import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {
    @GET("trending/all/day")
    suspend fun trendingMovies(@Query("api_key", encoded = false) apiKey: String = API_KEY):Response <MovieResult>
}