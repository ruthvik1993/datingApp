package com.example.myapplication.serviceInterface

import androidx.annotation.Keep
import com.example.myapplication.model.LoginRequestUserModel
import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * @author Munish Chandel
 */

interface LoginApi {

    @POST("LoginController/Login")
    fun validateLogin(@Body login: LoginRequestUserModel?): Call<LoginRequestUserModel?>?
}

@Keep
data class ServiceResponse<T>(
    @SerializedName("data") val data: T
)
