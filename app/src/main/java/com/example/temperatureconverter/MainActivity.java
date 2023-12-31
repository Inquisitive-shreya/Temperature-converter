package com.example.temperatureconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button cToF,fToC;
    TextView result ;
    EditText enterTemp;
    double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cToF = findViewById(R.id.cToF);
        fToC = findViewById(R.id.fToC);
        result = findViewById(R.id.result);
        enterTemp = findViewById(R.id.enterTemp);

        cToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
              double result0= (temp * 1.8) + 32;
                 result.setText(String.valueOf(result0));
            }
        });

        fToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = (temp - 32) / 1.8;
                result.setText(String.valueOf(result0));
            }
        });
    }
}

