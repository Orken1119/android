package com.example.actorpage.repository

import com.example.actorpage.models.FilmItems
import com.example.actorpage.models.ToShow
import com.example.actorpage.models.MainData

class ApiCall {
    suspend fun fetchActorDetails(actorId: Int): ToShow {
        val actor = RetrofitManager.apiService.getActorDetailById(actorId)

        return ToShow(
            nameRu = actor.nameRu,
            profession = actor.profession,
            posterUrl = actor.posterUrl,
            FilmIds = actor.films.map { it.filmId }
        )
    }
    suspend fun fetchFilmDetails(filmId: Int): FilmItems {
        val film = RetrofitManager.apiService.getMovieDetailById(filmId)

        return FilmItems(
            nameRu = film.nameRu ?: "Неизвестно",
            rating = film.ratingKinopoisk ?: -1.0f,
            genres = film.genres ?: emptyList(),
            posterUrl = film.posterUrl ?: "https://example.com/default_poster.png"
        )

    }
    suspend fun fetchFilmography(filmIds: List<Int>): List<FilmItems> {
        return filmIds.map { id ->
            fetchFilmDetails(id)
        }.sortedByDescending { filmItem ->
            filmItem.rating
        }
    }
    suspend fun fetchMainData(actorId: Int): MainData {
        val actorDetails = fetchActorDetails(actorId) // Adjust repository method if needed
        val filmography = fetchFilmography(actorDetails.FilmIds)

        return MainData(
            nameRu = actorDetails.nameRu,
            profession = actorDetails.profession,
            posterUrl = actorDetails.posterUrl,
            allFilms = filmography
        )
    }
}