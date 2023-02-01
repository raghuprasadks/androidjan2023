package com.reva.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity_ImageView_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_image_view6);
        ImageView imageView=findViewById(R.id.imageView1);

        Drawable drawable=getResources().getDrawable(R.drawable.nature);
        imageView.setImageDrawable(drawable);
    }
}