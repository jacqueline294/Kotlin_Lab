// LoggedInActivity.kt
package com.example.mylabproject1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoggedActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)

        val calendarView: CalendarView = findViewById(R.id.calendar)
        val bookButton: Button = findViewById(R.id.btnbook)
        val bookedTextView: TextView = findViewById(R.id.booked_text_view)


        bookButton.setOnClickListener {
            if (bookedTextView.visibility == TextView.VISIBLE) {
                bookedTextView.visibility = TextView.GONE
            } else {
                bookedTextView.visibility = TextView.VISIBLE
                bookedTextView.text = "Date Booked"
            }
        }

    }
}
