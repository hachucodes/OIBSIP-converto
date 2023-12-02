package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class move1 extends AppCompatActivity {
    EditText input1;
    MaterialButton gtkg,kgtg,kgtp,ptkg,gtp,ptg;
    MaterialButton clear;
    TextView result1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move1);

        input1 = findViewById(R.id.input1);
        result1 = findViewById(R.id.result1);
        clear = findViewById(R.id.clear);

        //initializing all buttons

        gtkg = findViewById(R.id.gtkg);
        kgtg = findViewById(R.id.kgtg);
        kgtp = findViewById(R.id.kgtp);
        ptkg = findViewById(R.id.ptkg);
        gtp = findViewById(R.id.gtp);
        ptg = findViewById(R.id.ptg);

        //setting clear button

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                result1.setText("0000");
            }
        });

        //set button to convertion

        gtkg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/1000;
                result1.setText("kg:"+output);
            }
        });

        kgtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a*1000;
                result1.setText("gms:"+output);
            }
        });

        kgtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a*2.205;
                result1.setText("pounds:"+output);
            }
        });

        ptkg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/2.205;
                result1.setText("kg:"+output);
            }
        });

        gtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/453.6;
                result1.setText("pounds:"+output);
            }
        });

        ptg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a*453.6;
                result1.setText("gms:"+output);
            }
        });

    }
}