package com.example.barberhub

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Handle Profile click
        findViewById<View>(R.id.menuProfile).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        // Handle Products click
        findViewById<View>(R.id.menuProducts).setOnClickListener {
            startActivity(Intent(this, ProductsActivity::class.java))
        }

        // Handle Orders click
        findViewById<View>(R.id.menuOrders).setOnClickListener {
            startActivity(Intent(this, OrdersActivity::class.java))
        }

        // Handle Cart click
        findViewById<View>(R.id.menuCart).setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }

        // Handle Settings click
        findViewById<View>(R.id.menuSettings).setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        // Handle Log Out click
        findViewById<View>(R.id.menuLogOut).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Close the current activity and go back to LoginActivity
        }
    }
}
