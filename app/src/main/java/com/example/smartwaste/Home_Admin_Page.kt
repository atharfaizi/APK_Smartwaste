package com.example.smartwaste

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class Home_Admin_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_admin_page)


        gantiFragment(HomeFragment())
        val navbar = findViewById<BottomNavigationView>(R.id.Bottom_navbar)

        val intent = Intent(this@Home_Admin_Page, CreateActivity::class.java)

        navbar.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.NavbarBtnListSchedule -> gantiFragment(HomeFragment())
                R.id.NavbarBtnCread -> startActivity(intent)
                R.id.NavbarBtnProfile -> gantiFragment(ProfileFragment())
                else -> {
                }
            }
            true
        }

    }

    private fun gantiFragment(fragment : Fragment) {
        supportFragmentManager.commit {
            replace(R.id.Fragment_main, fragment, "myFragment")
        }
    }
}