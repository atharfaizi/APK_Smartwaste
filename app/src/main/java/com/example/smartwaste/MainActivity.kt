package com.example.smartwaste

import android.content.Intent
import android.widget.Button
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_page) // Set content view to the choose page layout

        val loginButton: Button = findViewById(R.id.admin_button)
        val registerButton: Button = findViewById(R.id.user_button)

        // Navigate to login page when login button is clicked
        loginButton.setOnClickListener {
            val loginIntent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(loginIntent)
        }

        // Navigate to register page when register button is clicked
        registerButton.setOnClickListener {
            val registerIntent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(registerIntent)
        }
    }
}
