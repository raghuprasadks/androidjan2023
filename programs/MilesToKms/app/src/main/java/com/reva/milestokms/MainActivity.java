package com.reva.milestokms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnconverter = findViewById(R.id.buttonConverter);

        btnconverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText milesTxt = findViewById(R.id.miles);
                Editable editable = milesTxt.getText();
                float miles = new Float(editable.toString()).floatValue();

                float kms = miles *1.6f;

                TextView resultview = findViewById(R.id.textResultConverter);

                resultview.setText(new Float(kms).toString());
            }
        });

    }
}