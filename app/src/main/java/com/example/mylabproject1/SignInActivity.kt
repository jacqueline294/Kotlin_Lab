package com.example.mylabproject1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signInButton: Button = findViewById(R.id.sign_in_button)
        val usernameEditText: EditText = findViewById(R.id.username_edit_text)

        signInButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            if (isValidUser(username)) {
                val intent = Intent(this, LoggedInActivity::class.java)
                intent.putExtra("USERNAME", username)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Invalid username", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidUser(username: String): Boolean {
        val validUsers = arrayOf("user1", "user2", "user3")
        return validUsers.contains(username)
    }
}

