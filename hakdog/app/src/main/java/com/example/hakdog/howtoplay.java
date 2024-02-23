package com.example.hakdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class howtoplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howtoplay);

        // Check if the device is in landscape mode
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Set the GIF as the background
            getWindow().setBackgroundDrawableResource(R.drawable.howtoplay);

            ImageView imageView = findViewById(R.id.imageView6);

            Glide.with(this)
                    .load(R.drawable.howtoplay)
                    .into(imageView);

        }
    }
}