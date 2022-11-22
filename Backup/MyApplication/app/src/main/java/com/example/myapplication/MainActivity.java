package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.firstBtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity1();
            }
        });

        Button button2 = findViewById(R.id.secondBtn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity2();
            }
        });

        Button button3 = findViewById(R.id.thirdBtn);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity3();
            }
        });
    }

    public void activity1(){
        Intent intent = new Intent(this, problem1_try.class);
        startActivity(intent);
    }

    public void activity2(){
        Intent intent = new Intent(this,problem2.class);
        startActivity(intent);
    }

    public void activity3(){
        Intent intent = new Intent(this, problem3.class);
        startActivity(intent);
    }
}