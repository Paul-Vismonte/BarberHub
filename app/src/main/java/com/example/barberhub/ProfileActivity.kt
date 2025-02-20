package com.example.barberhub

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Handle Back Button Click
        findViewById<View>(R.id.btnBack).setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish() // Close ProfileActivity
        }

        findViewById<View>(R.id.btnSettings).setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
            finish() // Close ProfileActivity
        }
    }
}
