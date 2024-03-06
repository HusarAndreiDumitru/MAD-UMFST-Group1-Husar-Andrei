package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Butoane
        val btnAdd: Button = findViewById(R.id.add)
        val btnSub: Button = findViewById(R.id.sub)
        val btnDiv: Button = findViewById(R.id.div)
        val btnMul: Button = findViewById(R.id.mul)
//TextViews/EditText
        val total: TextView = findViewById(R.id.total)
        val nr1: EditText = findViewById(R.id.nr1)
        val nr2: EditText = findViewById(R.id.nr2)
//Valorile to string to int


        btnAdd.setOnClickListener(){
            val nr1String: String = nr1.text.toString()
            val nr1Int: Int = nr1String.toInt()
            val nr2String: String = nr2.text.toString()
            val nr2Int: Int = nr2String.toInt()
            val tot: Int = nr1Int + nr2Int
            total.text = tot.toString();
        }
        btnSub.setOnClickListener(){
            val nr1String: String = nr1.text.toString()
            val nr1Int: Int = nr1String.toInt()
            val nr2String: String = nr2.text.toString()
            val nr2Int: Int = nr2String.toInt()
            val tot: Int = nr1Int - nr2Int
            total.text = tot.toString()
        }
        btnDiv.setOnClickListener(){
            val nr1String: String = nr1.text.toString()
            val nr1Int: Int = nr1String.toInt()
            val nr2String: String = nr2.text.toString()
            val nr2Int: Int = nr2String.toInt()
            val tot: Int = nr1Int / nr2Int
            total.text = tot.toString()
        }
        btnMul.setOnClickListener(){
            val nr1String: String = nr1.text.toString()
            val nr1Int: Int = nr1String.toInt()
            val nr2String: String = nr2.text.toString()
            val nr2Int: Int = nr2String.toInt()
            val tot: Int = nr1Int * nr2Int
            total.text = tot.toString()
        }
    }
}