package com.example.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnJava = findViewById<Button>(R.id.btnJava)
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)

        btnJava.setOnClickListener {
            startActivity(Intent(this@MainActivity,
                BMIJavaActivity::class.java))
        }

        btnKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity,
                BMIKotlinActivity::class.java))
        }
    }
}