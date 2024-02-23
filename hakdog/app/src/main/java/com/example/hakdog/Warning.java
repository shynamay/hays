package com.example.hakdog;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class Warning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning);

        // Check if the device is in landscape mode
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Set the GIF as the background
            getWindow().setBackgroundDrawableResource(R.drawable.s2);

            ImageView imageView = findViewById(R.id.imageView2);

            Glide.with(this)
                    .load(R.drawable.s2)
                    .into(imageView);

        }
    }
}