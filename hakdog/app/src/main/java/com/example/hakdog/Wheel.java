package com.example.hakdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Wheel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheel);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Set the GIF as the background
            getWindow().setBackgroundDrawableResource(R.drawable.wheel1);

            ImageView imageView = findViewById(R.id.imageView);

            Glide.with(this)
                    .load(R.drawable.wheel1)
                    .into(imageView);

        }
    }
}