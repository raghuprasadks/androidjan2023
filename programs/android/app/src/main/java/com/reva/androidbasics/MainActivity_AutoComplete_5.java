package com.reva.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity_AutoComplete_5 extends AppCompatActivity {

    static final String[] countries={"India","Australia","West indies","indonesia","Indiana","South Africa","England","Bangladesh","Sri lanka","singapore"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_autocomplete_5);
         ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,countries);
                  AutoCompleteTextView textView=(AutoCompleteTextView)findViewById(R.id.txtcountries);
                  textView.setThreshold(3);
                  textView.setAdapter(adapter);


    }
}