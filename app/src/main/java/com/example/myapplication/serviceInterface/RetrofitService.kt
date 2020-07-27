package com.example.myapplication.serviceInterface

import com.example.myapplication.model.VersionCheckModel
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitService {
    @GET("/posts")
    suspend fun getPosts(): Response<VersionCheckModel>
}