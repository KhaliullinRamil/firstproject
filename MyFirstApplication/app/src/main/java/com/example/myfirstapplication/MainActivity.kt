package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button_1)
        val btn2 = findViewById<Button>(R.id.button_2)
        val btn3 = findViewById<Button>(R.id.button_3)

        btn1.setOnClickListener {
            Log.e("Click", "Button 1 click!")
        }
        btn2.setOnClickListener {
            Log.e("Click", "Button 2 click!")
        }
        btn3.setOnClickListener {
            Log.e("Click", "Button 3 click!")
        }
    }
}