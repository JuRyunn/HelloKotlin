package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {
    int clickCount;
    TextView txtActivityStartTime,txtCountBtnClicks, txtElapsedTime;
    Button btnClickMe;
    final long startTime = System.currentTimeMillis();
    long elapsedSeconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        txtActivityStartTime = findViewById(R.id.txtActivityStartTime);
        txtCountBtnClicks = findViewById(R.id.txtCountBtnClicks);
        btnClickMe = findViewById(R.id.btnClickMe);
        txtElapsedTime = findViewById(R.id.txtElapsedTime);

        clickCount = 0;
        /*startTime = System.currentTimeMillis();*/

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elapsedSeconds = (long) ((System.currentTimeMillis() - startTime) / 1000.0);
                clickCount ++;
                txtCountBtnClicks.setText("Button clicks: " + clickCount);
                txtElapsedTime.setText( elapsedSeconds + " seconds Elapsed");
            }
        });
        String sTimeStamp = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);
        txtActivityStartTime.setText("Activity start time = " + sTimeStamp);
    }
}