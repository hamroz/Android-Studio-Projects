package com.example.practical6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class exercise2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);


        Button button = findViewById(R.id.button);
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

        Button exercise3forward = findViewById(R.id.btnEX3);
        exercise3forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise3();
            }
        });
    }

    public void solution(){
        EditText input = findViewById(R.id.input);
        TextView output = findViewById(R.id.result);

        output.setMovementMethod(new ScrollingMovementMethod());

        int n = Integer.parseInt(input.getText().toString());

        String result = "";
        for (int i = n; i > 0; i--){
            for (int j=0; j < i; j++){
                result += "*";
            }
            result += "\n";
        }
        output.setText(result + "");
    }

    public void exercise1(){
        Intent intent = new Intent(this,exercise1.class);
        startActivity(intent);
    }

    public void exercise3(){
        Intent intent = new Intent(this,exercise3.class);
        startActivity(intent);
    }

}