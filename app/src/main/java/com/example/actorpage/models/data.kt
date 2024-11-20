package com.example.actorpage.models

data class Actor(
    val personId: Int,
    val webUrl: String,
    val nameRu: String,
    val nameEn: String,
    val sex: String,
    val posterUrl: String,
    val growth: String,
    val birthday: String,
    val death: String,
    val age: Int,
    val birthplace: String,
    val deathplace: String,
    val hasAwards: Boolean,
    val profession: String,
    val facts: List<String>,
    val spouses: List<Spouse>,
    val films: List<Film>
)


data class Spouse(
    val personId: Int,
    val name: String,
    val divorced: Boolean,
    val divorcedReason: String,
    val sex: String,
    val children: Int,
    val webUrl: String,
    val relation: String
)

data class Film(
    val filmId: Int,
    val nameRu: String,
    val nameEn: String,
    val rating: String,
    val general: Boolean,
    val description: String,
    val professionKey: String
)
data class FilmDetails(
    val kinopoiskId: Int,
    val kinopoiskHDId: String?,
    val imdbId: String?,
    val nameRu: String?,
    val nameEn: String?,
    val nameOriginal: String?,
    val posterUrl: String?,
    val posterUrlPreview: String?,
    val coverUrl: String?,
    val logoUrl: String?,
    val reviewsCount: Int?,
    val ratingGoodReview: Float?,
    val ratingGoodReviewVoteCount: Int?,
    val ratingKinopoisk: Float?,
    val ratingKinopoiskVoteCount: Int?,
    val ratingImdb: Float?,
    val ratingImdbVoteCount: Int?,
    val ratingFilmCritics: Float?,
    val ratingFilmCriticsVoteCount: Int?,
    val ratingAwait: Float?,
    val ratingAwaitCount: Int?,
    val ratingRfCritics: Float?,
    val ratingRfCriticsVoteCount: Int?,
    val webUrl: String?,
    val year: Int?,
    val filmLength: Int?,
    val slogan: String?,
    val description: String?,
    val shortDescription: String?,
    val editorAnnotation: String?,
    val isTicketsAvailable: Boolean,
    val productionStatus: String?,
    val type: String?,
    val ratingMpaa: String?,
    val ratingAgeLimits: String?,
    val countries: List<Country>?,
    val genres: List<Genre>?,
    val startYear: Int?,
    val endYear: Int?,
    val serial: Boolean,
    val shortFilm: Boolean,
    val completed: Boolean,
    val hasImax: Boolean,
    val has3D: Boolean,
    val lastSync: String?
)

data class Country(
    val country: String
)

data class Genre(
    val genre: String
)



data class ToShow(
    val nameRu: String,
    val profession: String,
    val posterUrl: String,
    val FilmIds: List<Int>
)

data class FilmItems(
    val nameRu: String?,
    val rating: Float?,
    val genres: List<Genre>?,
    val posterUrl: String?
    )

data class MainData(
    val nameRu: String,
    val profession: String,
    val posterUrl: String,
    val allFilms: List<FilmItems>
)

