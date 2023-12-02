package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class move4 extends AppCompatActivity {

    EditText input1;
    MaterialButton stmin,mints,hts,sth,mth,htm,mtd,htd;
    MaterialButton clear;
    TextView result1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move4);

        input1 = findViewById(R.id.input1);
        result1 = findViewById(R.id.result1);
        clear = findViewById(R.id.clear);

        //initializing all buttons
        stmin = findViewById(R.id.stmin);
        mints = findViewById(R.id.mints);
        hts = findViewById(R.id.hts);
        sth = findViewById(R.id.sth);
        mth = findViewById(R.id.mth);
        htm = findViewById(R.id.htm);
        mtd = findViewById(R.id.mtd);
        htd = findViewById(R.id.htd);

        //setting clear button

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                result1.setText("0000");
            }
        });

        //set button to convertion

        stmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/60;
                result1.setText(output+"mins");
            }
        });

        mints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a*60;
                result1.setText(output+"secs");
            }
        });

        hts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a*3600;
                result1.setText(output+"secs");
            }
        });

        sth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/3600;
                result1.setText(output+"hrs");
            }
        });

        mth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/60;
                result1.setText(output+"hrs");
            }
        });

        htm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a*60;
                result1.setText(output+"mins");
            }
        });

        mtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/1440;
                result1.setText(output+"days");
            }
        });

        htd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/24;
                result1.setText(output+"days");
            }
        });
    }
}