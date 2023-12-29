package com.example.taskerapp.presentation

import android.app.Application
import androidx.room.Room
import com.example.taskerapp.data.local.TaslDatabace

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        databae = Room.databaseBuilder(
            this,
            TaslDatabace::class.java,
            "tasker_app_databacek"
        ).allowMainThreadQueries()
            .build()
    }

    companion object {
        lateinit var databae: TaslDatabace
    }
}