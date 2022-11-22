package com.example.practical6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class exercise3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solution();
            }
        });


        Button exercise2forward = findViewById(R.id.btnEX1);
        exercise2forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise1();
            }
        });

        Button exercise3forward = findViewById(R.id.btnEX2);
        exercise3forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise2();
            }
        });

    }

    public void solution(){
        EditText aET = findViewById(R.id.aET);
        EditText bET = findViewById(R.id.bET);
        EditText opr = findViewById(R.id.operatorET);
        TextView resultTV = findViewById(R.id.resultTV);

        float a = Float.parseFloat(aET.getText().toString());
        float b = Float.parseFloat(bET.getText().toString());
        String operator = opr.getText().toString();

        if (operator.equals("+")){
            float result = a + b;
            resultTV.setText(a + " + " + b + " = " + result);
        }else if(operator.equals("-")){
            float result = a - b;
            resultTV.setText(a + " - " + b + " = " + result);
        }else if(operator.equals("*")){
            float result = a * b;
            resultTV.setText(a + " * " + b + " = " + result);
        }else if(operator.equals("/")){
            float result = a / b;
            resultTV.setText(a + " / " + b + " = " + result);
        }else{
            resultTV.setText("Please enter valid operator!");
        }
    }

    public void exercise1(){
        Intent intent = new Intent(this,exercise1.class);
        startActivity(intent);
    }

    public void exercise2(){
        Intent intent = new Intent(this,exercise2.class);
        startActivity(intent);
    }
}