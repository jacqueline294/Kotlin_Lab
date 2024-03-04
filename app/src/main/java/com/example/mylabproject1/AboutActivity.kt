package com.example.mylabproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val backButton: Button = findViewById(R.id.back_button)

        backButton.setOnClickListener {

            OnBackPressed()
        }
    }
}

class OnBackPressed {

}


