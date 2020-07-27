package com.example.myapplication.serviceInterface

import com.example.myapplication.model.VersionCheckModel
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface RetrofitService {
    @FormUrlEncoded
    @POST("/contact/versioncheck")
    suspend fun getPosts(@Field("version_code") version_code: String): Response<VersionCheckModel>
}