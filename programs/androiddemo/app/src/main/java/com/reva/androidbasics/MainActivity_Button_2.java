package com.reva.androidbasics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity_Button_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_button2);

        Button btnred = findViewById(R.id.btnred);
        btnred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity_Button_2.this,"Red button clicked",Toast.LENGTH_LONG).show();
            }
        });

        ConstraintLayout constraintLayout= findViewById(R.id.constraintlayout);
        Button btngreen = findViewById(R.id.btngreen);
        btngreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                constraintLayout.setBackgroundColor(Color.GREEN);
            }
        });

    }
}