package com.example.hellokotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActivityStartTime)
        val txtCountBtnClicks = findViewById<TextView>(R.id.txtCountBtnClicks)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val txtElapsedTime = findViewById<TextView>(R.id.txtElapsedTime)

        var clickCount = 0
        val startTime = System.currentTimeMillis()
        val sTimeStemp = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)
        txtActivityStartTime.text = ("Activity start time = ${sTimeStemp}")


        btnClickMe.setOnClickListener{
            clickCount++
            txtCountBtnClicks.text = "BUtton clciks = ${clickCount}"
            var elapsedSeconds : Long = ((System.currentTimeMillis() - startTime) / 1000.0).toLong()
            txtElapsedTime.text = "${elapsedSeconds} seconds elapsed"
        }
    }
}