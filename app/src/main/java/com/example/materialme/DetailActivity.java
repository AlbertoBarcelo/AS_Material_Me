package com.example.materialme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Obtén los datos del Intent
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        int imageResource = intent.getIntExtra("image_resource", 0);

        // Configura las vistas
        TextView titleDetail = findViewById(R.id.titleDetail);
        ImageView sportsImageDetail = findViewById(R.id.sportsImageDetail);

        titleDetail.setText(title);
        Glide.with(this).load(imageResource).into(sportsImageDetail);
    }
}
