package com.example.mylabproject1


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView


class LoggedInActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)
        val usernameEditText = 0
        val usernameTextView: TextView = findViewById(usernameEditText)

        val username = intent.getStringExtra("USERNAME")
        usernameTextView.text = "Welcome, $username!"
    }
}
