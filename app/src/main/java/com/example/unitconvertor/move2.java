package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class move2 extends AppCompatActivity {

    EditText input1;
    MaterialButton mtcm,cmtm,kmtm,mtkm,mmtcm,cmtmm,itcm,cmti ;
    MaterialButton clear;
    TextView result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move2);


        input1 = findViewById(R.id.input1);
        result1 = findViewById(R.id.result1);
        clear = findViewById(R.id.clear);

        //initializing all buttons

        mtcm = findViewById(R.id.mtcm);
        cmtm = findViewById(R.id.cmtm);
        kmtm = findViewById(R.id.kmtm);
        mtkm = findViewById(R.id.mtkm);
        mmtcm = findViewById(R.id.mmtcm);
        cmtmm = findViewById(R.id.cmtmm);
        itcm = findViewById(R.id.itcm);
        cmti = findViewById(R.id.cmti);

        //setting clear button

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                result1.setText("0000");
            }
        });

        //set button to convertion

        mtcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a*100;
                result1.setText("cm:"+output);
            }
        });

        cmtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/100;
                result1.setText("m:"+output);
            }
        });

        kmtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a*1000;
                result1.setText("m:"+output);
            }
        });

        mtkm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/1000;
                result1.setText("km:"+output);
            }
        });

        mmtcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/10;
                result1.setText("cm:"+output);
            }
        });

        cmtmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a*10;
                result1.setText("mm:"+output);
            }
        });

        itcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a*2.54;
                result1.setText("cm:"+output);
            }
        });

        cmti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input1.getText().toString();
                int a = Integer.parseInt(s);
                double output = a/2.54;
                result1.setText("inch:"+output);
            }
        });
    }
}