package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.editTextNumber);
        val btn: Button = findViewById(R.id.buttonToast);
        val btnCount: Button = findViewById(R.id.buttonCount)

        btn.setOnClickListener {
            val initial: String = textView.text.toString()
            var numar: Int = initial.toInt()
            numar--
            textView.text = numar.toString()
            Toast.makeText(this, "Butonul a fost apasat ", Toast.LENGTH_LONG).show()

        }

        btnCount.setOnClickListener{
            val initial: String = textView.text.toString()
            var numar: Int = initial.toInt()
            numar++
            textView.text = numar.toString()

        }
    }
}