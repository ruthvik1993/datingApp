package com.example.myapplication.network

import android.util.Log
import com.example.myapplication.serviceInterface.RetrofitService
import com.google.gson.GsonBuilder
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

import retrofit2.converter.moshi.MoshiConverterFactory

import java.util.concurrent.TimeUnit

object ApiClient {

    const val BASE_URL = "https://jsonplaceholder.typicode.com"

    fun makeRetrofitService(): RetrofitService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build().create(RetrofitService::class.java)
    }
}