package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.imageview.ShapeableImageView;

public class MainActivity extends AppCompatActivity {
    private ShapeableImageView Weights;
    private ShapeableImageView Temps;
    private ShapeableImageView Lengths;
    private ShapeableImageView Times;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Weights = findViewById(R.id.weights);
        Temps = findViewById(R.id.temps);
        Lengths = findViewById(R.id.lengths);
        Times = findViewById(R.id.times);

        Weights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, move1.class);
                startActivity(intent);
            }
        });

        Lengths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, move2.class);
                startActivity(intent);
            }
        });

        Temps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, move3.class);
                startActivity(intent);
            }
        });

        Times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, move4.class);
                startActivity(intent);
            }
        });

    }
}