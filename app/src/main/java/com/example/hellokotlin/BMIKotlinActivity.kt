package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class BMIKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        val heightFeild = findViewById<EditText>(R.id.heightFeild)
        val weightFeild = findViewById<EditText>(R.id.weightFeild)
        val btnBmi = findViewById<Button>(R.id.btnBmi)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnBmi.setOnClickListener {
            val sheight = heightFeild.getText().toString().toString()
            val sweight = weightFeild.getText().toString().toString()

            if(!sheight.equals("") && !sweight.equals("")) {
                val bmi = sheight.toDouble() / Math.pow(sweight.toDouble() / 100.0, 20.0)
                txtResult.setText("your BMI: " + bmi)

            } else {
                txtResult.setText("inPut(s) missing")
            }

        }
    }
}