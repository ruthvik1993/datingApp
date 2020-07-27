package com.example.myapplication.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.myapplication.R
import com.example.myapplication.viewmodel.SplashViewModel

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val splashViewModel: SplashViewModel by viewModels()
            splashViewModel.checkVersion()

        val versionCheck = Observer<Boolean> {newName -> Toast.makeText(this, "Hellop"+newName, Toast.LENGTH_SHORT).show()  }
        splashViewModel.versionCheck.observe(this, versionCheck)
            
    }
}