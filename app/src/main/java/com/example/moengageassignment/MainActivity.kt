package com.example.moengageassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moengage.core.analytics.MoEAnalyticsHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MoEAnalyticsHelper.setUserAttribute(this,"locality", "SF")


    }
}