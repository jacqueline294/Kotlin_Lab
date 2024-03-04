package com.example.mylabproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutButton: Button = findViewById(R.id.about_button)
        val signInButton: Button = findViewById(R.id.sign_in_button)

        aboutButton.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))

        }

        signInButton.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}
