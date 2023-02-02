package com.reva.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_SimpleInterest_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_simple_interest9);


        Button btnCalculate = findViewById(R.id.buttonSubmitSI);



        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editTextPrincipal = findViewById(R.id.editTextPrincipal);
                float principal = Float.parseFloat(editTextPrincipal.getText().toString());

                EditText editTextRate = findViewById(R.id.editTextRate);
                float rate = Float.parseFloat(editTextRate.getText().toString());

                EditText editTextTime = findViewById(R.id.editTextTime);
                float time = Float.parseFloat(editTextTime.getText().toString());

                float simpleInterest = (principal*rate*time)/100;
                TextView result = findViewById(R.id.textViewResult);
                result.setText("Simple Interest is " +new Float(simpleInterest).toString());
            }
        });

    }
}