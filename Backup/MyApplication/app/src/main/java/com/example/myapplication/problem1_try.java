package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import java.util.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class problem1_try extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem1_try);

        Button button = findViewById(R.id.button_pr1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solution();
            }
        });
    }

    public void solution(){
        EditText pr1ET = findViewById(R.id.pr1_ET);
        TextView pr1TV = findViewById(R.id.pr1_TV);

        long n = Long.parseLong(pr1ET.getText().toString());
        char ch;

        String y = String.valueOf(n),result="";

        for(int i = 0;i < y.length(); i++){
            ch = y.charAt(i);
            result = ch + " " + result;
        }

        pr1TV.setText(result);

    }
}