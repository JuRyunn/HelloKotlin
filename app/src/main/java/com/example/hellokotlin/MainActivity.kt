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

        val btnVarJava = findViewById<Button>(R.id.btnVarJava)
        val btnVarKotlin = findViewById<Button>(R.id.btnVarKotlin)

        val btnFlowControlJava = findViewById<Button>(R.id.btnFlowControlJava)
        val btnFlowControlKotlin = findViewById<Button>(R.id.btnFlowControlKotlin)

        btnJava.setOnClickListener {
            startActivity(Intent(this@MainActivity,
                BMIJavaActivity::class.java))
        }

        btnKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity,
                BMIKotlinActivity::class.java))
        }

        btnVarJava.setOnClickListener{
            startActivity(Intent(this@MainActivity,
                VariableJavaActivity::class.java))
        }

        btnVarKotlin.setOnClickListener{
            startActivity(Intent(this@MainActivity,
            VariableKotlinActivity::class.java))
        }

        btnFlowControlJava.setOnClickListener{
            startActivity(Intent(this@MainActivity,
                FlowControlJavaActivity::class.java))
        }

        btnFlowControlKotlin.setOnClickListener{
            startActivity(Intent(this@MainActivity,
            FlowControlKotlinActivity::class.java))
        }
    }
}