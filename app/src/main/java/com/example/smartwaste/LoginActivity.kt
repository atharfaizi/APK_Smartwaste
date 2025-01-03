package com.example.smartwaste

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Set content view to the login page layout


        val button = findViewById<Button>(R.id.btn_LoginSubmit)

        button.setOnClickListener{
            val intent = Intent(this, Home_Admin_Page::class.java)
            startActivity(intent)
        }
    }
}
