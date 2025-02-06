package com.thanapoj.abtme;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout aboutme = findViewById(R.id.aboutme);

        LinearLayout hobbies = findViewById(R.id.hobbies);
        LinearLayout favorite = findViewById(R.id.fav);
        LinearLayout contact = findViewById(R.id.contact);

        aboutme.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), aboutme.class);
            startActivity(intent);
        });

        hobbies.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), HobbiesAct.class);
            startActivity(intent);
        });

        favorite.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), FavAct.class);
            startActivity(intent);
        });

        contact.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ContactAct.class);
            startActivity(intent);
        });
    }
}
