package com.reva.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity_SignUp_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_signup_3);

        EditText nametxt = findViewById(R.id.editTextTextPersonName);

        Button submit = findViewById(R.id.buttonsubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable editable = nametxt.getText();
                String name = editable.toString();
                Toast.makeText(MainActivity_SignUp_3.this,name + " Registration Successful ",Toast.LENGTH_SHORT).show();

            }
        });

    }
}