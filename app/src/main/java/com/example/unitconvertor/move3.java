package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class move3 extends AppCompatActivity {

    EditText input1;
    MaterialButton ctf,ftc,ktc,ctk,ktf,ftk;
    MaterialButton clear;
    TextView result1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move3);

        input1 = findViewById(R.id.input1);
        result1 = findViewById(R.id.result1);
        clear = findViewById(R.id.clear);

        //initializing all buttons

        ctf = findViewById(R.id.ctf);
        ctk = findViewById(R.id.ctk);
        ftk = findViewById(R.id.ftk);
        ftc = findViewById(R.id.ftc);
        ktc = findViewById(R.id.ktc);
        ktf = findViewById(R.id.ktf);


        //setting clear button

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                result1.setText("0000");
            }
        });

        //set button to convertion

        ctf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = ((a*(9/5))+32);
                result1.setText("F:"+output);
            }
        });

        ftc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = ((a-32)+(5/9));
                result1.setText("C:"+output);
            }
        });

        ktc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a+273.15;
                result1.setText("C:"+output);
            }
        });

        ctk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a-273.15 ;
                result1.setText("K:"+output);
            }
        });

        ktf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = ((a-273.15)*(9/5)+32);
                result1.setText("F:"+output);
            }
        });

        ftk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = ((a-32)*(5/9)+273.15);
                result1.setText("K:"+output);
            }
        });
    }
}