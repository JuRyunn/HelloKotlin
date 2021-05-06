package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.hellokotlin.ToastUtilJava.toast_long;
import static com.example.hellokotlin.ToastUtilJava.toast_short;

public class FlowControlJavaActivity extends AppCompatActivity {
    EditText fieldNumber;
    Button btnLD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_flowcontrol);

        fieldNumber = findViewById(R.id.fieldNumber);
        btnLD = findViewById(R.id.btnLD);

        btnLD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(fieldNumber.getText().toString());

                if (number % 2 == 0) {
                   toast_short(number + "은(는) 2의 배수");
                }
                else if (number % 3 == 0) {
                    toast_short(number + "은(는) 3의 배수");
                }
                else {
                    toast_long(number + "은(는) else");
                }
                switch (number) {
                    case 4: btnLD.setText("실행 for 4" + number); break;
                    case 9: btnLD.setText("실행 for 9" + number); break;
                    default:
                        btnLD.setText("실행 for else"); break;

                }
            }
        });
    }
}
