package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ex1_btn = findViewById(R.id.ex1_btn);
        ex1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise1();
            }
        });

        Button ex2_btn = findViewById(R.id.ex2_btn);
        ex2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise2();
            }
        });

        Button ex3_btn = findViewById(R.id.ex3_btn);
        ex3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise3();
            }
        });


    }


    public void exercise1(){
        EditText ex1_ET_a = findViewById(R.id.ex1_ET_a);
        EditText ex1_ET_b = findViewById(R.id.ex1_ET_b);
        TextView ex1_TV = findViewById(R.id.ex1_TV);

        int a = Integer.parseInt(ex1_ET_a.getText().toString());
        int b = Integer.parseInt(ex1_ET_b.getText().toString());

        if (a > b){
            ex1_TV.setText(a + " is greater than " + b);
        }else if (a < b){
            ex1_TV.setText(a + " is less than " + b);
        }else{
            ex1_TV.setText(a + " and " + b + " are equal!");
        }
    }

    public void exercise2(){
        EditText ex2_ET = findViewById(R.id.ex2_ET);
        TextView ex2_TV = findViewById(R.id.ex2_TV);

        int n = Integer.parseInt(ex2_ET.getText().toString());

        String res = "";
        for (int i=1; i <= n; i++){

            int value = (int)Math.pow(i,2);
            if (value <= n ){
                res += value + " ";
            }
        }

        ex2_TV.setText(res+"");

    }

    public void exercise3(){
        EditText ex3_ET_a = findViewById(R.id.ex3_ET_a);
        EditText ex3_ET_b = findViewById(R.id.ex3_ET_b);
        TextView ex3_TV = findViewById(R.id.ex3_TV);

        int a = Integer.parseInt(ex3_ET_a.getText().toString());
        int b = Integer.parseInt(ex3_ET_b.getText().toString());

        int div = a / b;
        int remainder = a % b;

        ex3_TV.setText(div +", remainder "+remainder);

    }

}