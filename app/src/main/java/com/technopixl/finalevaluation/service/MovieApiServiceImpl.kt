package com.technopixl.finalevaluation.service

import com.technopixl.finalevaluation.model.MovieResult
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


public final class MovieApiServiceImpl : MovieApiService {

    private fun getRetrofit():Retrofit {

    val okBuilder = OkHttpClient().newBuilder().apply {
        connectTimeout(120, TimeUnit.SECONDS)
        callTimeout(120, TimeUnit.SECONDS)
        readTimeout (120, TimeUnit.SECONDS)
        writeTimeout(120, TimeUnit.SECONDS)
    }
    return Retrofit.Builder()
    .baseUrl(BASEURL)
    .addConverterFactory(GsonConverterFactory.create())
    .client(okBuilder.build())
    .build()
    }

    override suspend fun trendingMovies(apiKey: String): Response<MovieResult> {
        return getRetrofit().create(MovieApiService::class.java).trendingMovies()
    }

}