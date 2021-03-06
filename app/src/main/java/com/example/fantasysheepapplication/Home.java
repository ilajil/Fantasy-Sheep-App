package com.example.fantasysheepapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button mpoints, mtransfer, mfavourite, mdreamteam, mmakingpurchase, mdisease, mprofitnlosses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mpoints = findViewById(R.id.points);
        mtransfer = findViewById(R.id.transfer);
        mfavourite = findViewById(R.id.favourite);
        mdreamteam =findViewById(R.id.dreamteam);
        mmakingpurchase = findViewById(R.id.makingpurchase);
        mdisease = findViewById(R.id.disease);
        mprofitnlosses = findViewById(R.id.profitnlosses);



        mpoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity2_market.class));
            }
        });

        mtransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        mfavourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Dream_Team.class));
            }
        });

        mdreamteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Dream_Team.class));
            }
        });

        mmakingpurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Purchase.class));
            }
        });

        mdisease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Diseases.class));
            }
        });

        
        mprofitnlosses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ProfitLoss.class));
            }
        });
    }
}