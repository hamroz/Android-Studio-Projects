package com.example.practical6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class exercise1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solution();
            }
        });

        Button exercise2forward = findViewById(R.id.btnEX2);
        exercise2forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise2();
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
        EditText aET1 = findViewById(R.id.aET1);
        TextView resTV1 = findViewById(R.id.resTV1);
        resTV1.setMovementMethod(new ScrollingMovementMethod());

        int n = Integer.parseInt(aET1.getText().toString());

        if (n < 0){
            resTV1.setText("Please enter positive integers!");
        }else{
            String result = "";

            int n1=0,n2=1,n3;
            result += n1+" "+n2;

            for(int i=2;i<n;++i){
                n3=n1+n2;
                result += " "+n3;
                n1=n2;
                n2=n3;
            }
            resTV1.setText(result);
        }
    }

    public void exercise2(){
        Intent intent = new Intent(this,exercise2.class);
        startActivity(intent);
    }

    public void exercise3(){
        Intent intent = new Intent(this,exercise3.class);
        startActivity(intent);
    }
}