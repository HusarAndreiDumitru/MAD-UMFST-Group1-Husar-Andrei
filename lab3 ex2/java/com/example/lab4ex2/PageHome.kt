package com.example.lab4ex2

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PageHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_home)

        val btnDracula: ImageButton = findViewById(R.id.draculBtn)
        val intentDracula = Intent(this, MainActivity::class.java)


        btnDracula.setOnClickListener(){
            startActivity(intentDracula)
        }


    }
}