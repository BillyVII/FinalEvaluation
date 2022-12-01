package com.technopixl.finalevaluation.model


import com.google.gson.annotations.SerializedName

data class MovieResult(
    val page: Int, // 1
    val results: List<Result>,
    @SerializedName("total_pages")
    val totalPages: Int, // 1000
    @SerializedName("total_results")
    val totalResults: Int // 20000
) {
    data class Result(
        val adult: Boolean, // false
        @SerializedName("backdrop_path")
        val backdropPath: String, // /93SxdkiR3gBcbG5FxIt0DCBttul.jpg
        @SerializedName("first_air_date")
        val firstAirDate: String, // 2022-11-30
        @SerializedName("genre_ids")
        val genreIds: List<Int>,
        val id: Int, // 111837
        @SerializedName("media_type")
        val mediaType: String, // tv
        val name: String, // Willow
        @SerializedName("origin_country")
        val originCountry: List<String>,
        @SerializedName("original_language")
        val originalLanguage: String, // en
        @SerializedName("original_name")
        val originalName: String, // Willow
        @SerializedName("original_title")
        val originalTitle: String, // The Guardians of the Galaxy Holiday Special
        val overview: String, // Many years after the events of the original film, legendary sorcerer Willow leads a group of misfit heroes on a dangerous rescue mission through a world beyond their wildest imaginations.
        val popularity: Double, // 101.781
        @SerializedName("poster_path")
        val posterPath: String, // /jhdSPDlhswjN1r6O0pGP3ZvQgU8.jpg
        @SerializedName("release_date")
        val releaseDate: String, // 2022-11-25
        val title: String, // The Guardians of the Galaxy Holiday Special
        val video: Boolean, // false
        @SerializedName("vote_average")
        val voteAverage: Double, // 6.0
        @SerializedName("vote_count")
        val voteCount: Int // 16
    )
}