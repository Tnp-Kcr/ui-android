package com.thanapoj.abtme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class aboutme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_aboutme);

            Button buttonHome = findViewById(R.id.button_home);
            Button buttonNext = findViewById(R.id.button_next);
            ImageView homeIcon = findViewById(R.id.home_icon);

            homeIcon.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

            buttonHome.setOnClickListener(v -> {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            });

            buttonNext.setOnClickListener(v -> {
                Intent intent = new Intent(getApplicationContext(), HobbiesAct.class);
                startActivity(intent);
            });
    }
}