package com.thanapoj.abtme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HobbiesAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);


        ImageView homeIcon = findViewById(R.id.home_icon);
        homeIcon.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });


        Button gameButton = findViewById(R.id.game_button);
        gameButton.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://playvalorant.com/"));
            startActivity(browserIntent);
        });


        Button musicButton = findViewById(R.id.music_button);
        musicButton.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://music.youtube.com/watch?v=ThI0pBAbFnk"));
            startActivity(browserIntent);
        });


        Button animeButton = findViewById(R.id.anime_button);
        animeButton.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bilibili.tv/"));
            startActivity(browserIntent);
        });

        Button buttonHome = findViewById(R.id.button_home);
        Button buttonNext = findViewById(R.id.button_next);
        Button buttonBack = findViewById(R.id.button_back);

        buttonBack.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), aboutme.class);
            startActivity(intent);
        });

        buttonHome.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

        buttonNext.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), FavAct.class);
            startActivity(intent);
        });
    }
}
