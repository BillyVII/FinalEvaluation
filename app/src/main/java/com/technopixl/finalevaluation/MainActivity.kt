package com.technopixl.finalevaluation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.technopixl.finalevaluation.service.API_KEY
import com.technopixl.finalevaluation.service.MovieApiServiceImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainActivity : AppCompatActivity() {
    private val service by lazy { MovieApiServiceImpl() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getMoviesAsync()
    }
    private fun getMoviesAsync() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.trendingMovies(API_KEY)
            withContext(Dispatchers.Main) {
                    if (response.isSuccessful){
                        response.body()?.results.let {
                             Log.d("MOVIES", "getMoviesAsync: $it")
                        }
                    }
                }
            }
        }

}
