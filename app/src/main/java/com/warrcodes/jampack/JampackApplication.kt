package com.warrcodes.jampack

import android.app.Application
import com.google.firebase.FirebaseApp

class JampackApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}