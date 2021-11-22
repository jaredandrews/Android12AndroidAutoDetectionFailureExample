package com.example.myapplication

import android.app.UiModeManager
import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        isCarUiMode(this);
    }

    // From: https://developer.android.com/training/cars/media#alarm
    fun isCarUiMode(c: Context): Boolean {
        val uiModeManager = c.getSystemService(Context.UI_MODE_SERVICE) as UiModeManager
        return if (uiModeManager.currentModeType == Configuration.UI_MODE_TYPE_CAR) {
            println("TEST: Running in Car mode")
            true
        } else {
            println("TEST: Running in a non-Car mode")
            false
        }
    }
}