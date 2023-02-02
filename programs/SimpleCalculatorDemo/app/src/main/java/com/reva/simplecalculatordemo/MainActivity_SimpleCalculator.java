package com.reva.simplecalculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_SimpleCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_simple_calculator);
        // functionality part

        Button calculatebtn = findViewById(R.id.buttonCalculate);
        calculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText prinipalTxt = findViewById(R.id.editTextPrincipal);
                Editable principal = prinipalTxt.getText();
                String principalString = principal.toString();
                float principalamt = new Float(principalString).floatValue();
                EditText rateTxt = findViewById(R.id.editTextRateOfInterest);
                Editable rate = rateTxt.getText();
                String rateString = rate.toString();
                float roi = new Float(rateString).floatValue();
                EditText timeTxt = findViewById(R.id.editTextTime);
                Editable timeEditable = timeTxt.getText();
                String timeString = timeEditable.toString();
                float time = new Float(timeString).floatValue();
                float si = (principalamt*roi*time)/100;
                TextView resulttxt = findViewById(R.id.textViewResult);
                resulttxt.setText(new Float(si).toString());
            }
        });

    }
}