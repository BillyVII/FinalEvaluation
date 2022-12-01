package com.technopixl.finalevaluation.service

import com.technopixl.finalevaluation.model.MovieResult
import retrofit2.http.GET
import retrofit2.http.Query

class MoviesApiService : BaseService() {
    interface AllMovieTrending{

        @GET("trending/all/day")
        suspend fun trendingMovies(
            @Query("api_key") apikey: String,
            @Query("language") language: String,
            @Query("page") page: Int,
        ) : MovieResult
    }
    suspend fun getTrendingMovies(
        apiKey: String,
        page: Int,
        language: String = "fr"
    ) = retrofit.create(AllMovieTrending::class.java)
        .trendingMovies(apiKey, language, page).results
}