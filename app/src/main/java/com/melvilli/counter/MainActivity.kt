package com.melvilli.counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Get reference to button
        val btnCLickMe: Button = findViewById(R.id.button)
        val myTextView: TextView = findViewById(R.id.counter)
        val welcomeView: TextView = findViewById(R.id.welcomeView)
        var timesClicked = 0

        // Set On-Click_Listener
        btnCLickMe.setOnClickListener {
            timesClicked += 1
            myTextView.text = timesClicked.toString()
            welcomeView.text = getString(R.string.counting)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}