package com.example.simplecalculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Привязка переменных к кнопкам
        val textViewSqrt: TextView = findViewById(R.id.btnSqrt)
        val textViewLog: TextView = findViewById(R.id.btnLog2)
        val textViewLn: TextView = findViewById(R.id.btnLn)
        val textViewLeftBracket: TextView = findViewById(R.id.btnLeftBracket)
        val textViewRightBracket: TextView = findViewById(R.id.btnRightBracket)

        val textViewPow = findViewById<TextView>(R.id.btnPow)
        val textViewClear = findViewById<TextView>(R.id.btnClear)
        val textViewBack = findViewById<TextView>(R.id.btnBack)
        val textViewPercent = findViewById<TextView>(R.id.btnPercent)
        val textViewDiv = findViewById<TextView>(R.id.btnDiv)
    }
}