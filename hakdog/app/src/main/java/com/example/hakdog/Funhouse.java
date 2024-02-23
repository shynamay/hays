package com.example.hakdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Funhouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funhouse);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Set the GIF as the background
            getWindow().setBackgroundDrawableResource(R.drawable.funhouse);

            ImageView imageView = findViewById(R.id.imageView4);

            Glide.with(this)
                    .load(R.drawable.funhouse)
                    .into(imageView);
        }
    }
}