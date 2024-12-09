package com.example.budgetbuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashScreen : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        var splashScreenLaunchBtn = findViewById<Button>(R.id.splashScreenLaunchBtn)
        var splashScreenExitButtonText = findViewById<Button>(R.id.splashScreenExitBtn)

        splashScreenLaunchBtn.setOnClickListener {
            val intent = Intent(this,MainScreen::class.java)
            startActivity(intent)
        }
        splashScreenExitButtonText.setOnClickListener {
            finish();
            System.exit(0);
        }
    }
}