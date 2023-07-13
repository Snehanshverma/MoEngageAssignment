package com.example.moengageassignment

import android.app.Application
import com.moengage.core.MoEngage

class MYAPP: Application() {
    override fun onCreate() {
        super.onCreate()
        val moEngage = MoEngage.Builder(this, "9KCPEMI0VCTUDJO3X4FR2A8I")
            .build()
        MoEngage.initialiseDefaultInstance(moEngage)
    }



}