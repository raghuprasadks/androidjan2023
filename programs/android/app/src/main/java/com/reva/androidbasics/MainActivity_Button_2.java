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
        setContentView(R.layout.activity_main_buttons_2);
        Button redbtn = findViewById(R.id.buttonred);

        redbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity_Button_2.this,"Red Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        Button greenbtn = findViewById(R.id.buttongreen);

        ConstraintLayout layout = findViewById(R.id.mainlayout);

        greenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.GREEN);

            }
        });
    }
}