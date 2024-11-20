package com.example.actorpage.repository

import com.example.actorpage.models.Actor

import com.example.actorpage.models.FilmDetails
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

public interface ApiService {
    @Headers("api-key: " + "419206c4-e916-43db-822d-3a444e4835a4")
    @GET("api/v1/staff/{id}")
    suspend fun getActorDetailById(@Path("id") id: Int): Actor

    @Headers("api-key: " + "419206c4-e916-43db-822d-3a444e4835a4")
    @GET("api/v2.2/films/{id}")
    suspend fun getMovieDetailById(@Path("id") id: Int): FilmDetails

}
