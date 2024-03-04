package com.example.mylabproject1


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoggedInActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)

        val username = intent.getStringExtra("USERNAME")
        val welcomeMessageTextView: TextView = findViewById(R.id.welcome_message_text_view)
        welcomeMessageTextView.text = "Welcome, $username!"
    }
}
