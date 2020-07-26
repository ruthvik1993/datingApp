package com.example.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.viewmodel.LoginViewModel

class MainActivity : AppCompatActivity() {

    private val loginModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val emailObserver = Observer<String> {newName -> Toast.makeText(this, "Hellop"+newName, Toast.LENGTH_SHORT).show()  }

        loginModel.emailAddress.observe(this, emailObserver)







    }
}