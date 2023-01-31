package com.reva.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity_EnhancedSignUp_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_enhancedsignup_4);

        RadioGroup radioGroup = findViewById(R.id.sex);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // on below line we are getting radio button from our group.
                RadioButton radioButton = findViewById(checkedId);

                // on below line we are displaying a toast message.
                Toast.makeText(MainActivity_EnhancedSignUp_4.this, "Selected Radio Button is : " + radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        CheckBox chkUG = findViewById(R.id.checkBoxUG);
        chkUG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity_EnhancedSignUp_4.this, "Checked : " + chkUG.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });


        // get reference to the string array that we just created
       // val languages = resources.getStringArray(R.array.programming_languages)
        String[] languages =getResources().getStringArray(R.array.programming_languages);
        // create an array adapter and pass the required parameter
        // in our case pass the context, drop down layout , and array.
        //val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_menu, languages)
        ArrayAdapter arrayAdapter= new ArrayAdapter(MainActivity_EnhancedSignUp_4.this,R.layout.dropdown_item,languages);
        // get reference to the autocomplete text view
        AutoCompleteTextView autoCompleteTextView= findViewById(R.id.autoCompleteTextView);
        //  val autocompleteTV = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
                // set adapter to the autocomplete tv to the arrayAdapter
              //  autocompleteTV.setAdapter(arrayAdapter)
        autoCompleteTextView.setAdapter(arrayAdapter);
    }
}