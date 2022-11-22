package com.example.practical6;

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

        Button btn1 = findViewById(R.id.ex1_btn);
        Button btn2 = findViewById(R.id.ex2_btn);
        Button btn3 = findViewById(R.id.ex3_btn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise1Func();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise2Func();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise3Func();
            }
        });
    }

    public void exercise1Func(){
        Intent intent = new Intent(this,exercise1.class);
        startActivity(intent);
    }

    public void exercise2Func(){
        Intent intent = new Intent(this, exercise2.class);
        startActivity(intent);
    }

    public void exercise3Func(){
        Intent intent = new Intent(this, exercise3.class);
        startActivity(intent);
    }

}