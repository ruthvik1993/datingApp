package com.example.myapplication.serviceInterface

import com.example.myapplication.model.VersionCheckModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface RetrofitService {
    @POST("contact/versioncheck")
    suspend fun getVersionCheck(): Response<VersionCheckModel>
}