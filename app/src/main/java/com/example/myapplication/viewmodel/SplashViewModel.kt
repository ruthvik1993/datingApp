package com.example.myapplication.viewmodel

import android.app.Application
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import androidx.lifecycle.AndroidViewModel
import com.example.myapplication.network.RetrofitFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class SplashViewModel : AndroidViewModel(Application()) {

     fun checkVersion() {
        val context = getApplication<Application>().applicationContext
        val manager: PackageManager = context.getPackageManager()
        var info: PackageInfo? = null
            info = manager.getPackageInfo(context.getPackageName(), PackageManager.GET_ACTIVITIES)


        val service = RetrofitFactory.makeRetrofitService()
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getPosts()
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful){

                    }else{

                    }
                } catch (e: HttpException) {

                } catch (e: Throwable) {

                }
            }
        }

    }


}
