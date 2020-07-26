package com.example.myapplication.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.LoginRequestUserModel




class LoginViewModel : ViewModel() {

     var emailAddress= MutableLiveData<String>()
     var password= MutableLiveData<String>()

    private var userMutableLiveData: MutableLiveData<LoginRequestUserModel>? = null

    fun getUser(): MutableLiveData<LoginRequestUserModel>? {
        if (userMutableLiveData == null) {
            userMutableLiveData = MutableLiveData()
        }
        return userMutableLiveData
    }


    fun onButtonClick(view: View?) {
        val loginUser = LoginRequestUserModel(emailAddress.getValue(), emailAddress.getValue(), "test", "tesy")
        userMutableLiveData!!.setValue(loginUser)
    }

}
