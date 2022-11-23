package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Exercise1(View view){
        Intent intent1 = new Intent(this, exercise1.class);

        startActivity(intent1);
    }

    public void Exercise2(View view){
        Intent intent2 = new Intent(this, exercise2.class);

        startActivity(intent2);
    }

    public void Exercise3(View view){
        Intent intent3 = new Intent(this, exercise3.class);

        startActivity(intent3);
    }

}