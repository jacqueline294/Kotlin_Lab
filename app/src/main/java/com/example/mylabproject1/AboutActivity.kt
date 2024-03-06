package com.example.mylabproject1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class AboutActivity : AppCompatActivity() {
    private lateinit var backButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        backButton = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}
