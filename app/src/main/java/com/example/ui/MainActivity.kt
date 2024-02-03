package com.example.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val darkBtn = findViewById<Button>(R.id.dark)
        val readBtn = findViewById<Button>(R.id.read)
        val layout = findViewById<LinearLayout>(R.id.linearlayout)
        darkBtn.setOnClickListener {
            layout.setBackgroundResource(R.color.grey)
        }
        readBtn.setOnClickListener {
            layout.setBackgroundResource(R.color.yellow)
        }
    }
}