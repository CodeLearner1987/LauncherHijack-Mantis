package com.baronkiko.launcherhijack;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    Button BaronKiko, ParrotGeek1, Speeddymon, Urbanman2004, wilkovatch, wolf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().hide();

        BaronKiko = findViewById(R.id.dev1);
        ParrotGeek1 = findViewById(R.id.dev2);
        Speeddymon = findViewById(R.id.dev3);
        Urbanman2004 = findViewById(R.id.dev4);
        wilkovatch = findViewById(R.id.dev5);
        wolf = findViewById(R.id.dev6);

        BaronKiko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/BaronKiko/LauncherHijack")));
            }
        });

        ParrotGeek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/parrotgeek1/LauncherHijack")));
            }
        });

        Speeddymon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Speeddymon/LauncherHijack")));
            }
        });
        Urbanman2004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/urbanman2004")));
            }
        });
        wilkovatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/wilkovatch/LauncherHijack")));
            }
        });
        wolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/sweenwolf/LauncherHijack")));
            }
        });

    }
}
