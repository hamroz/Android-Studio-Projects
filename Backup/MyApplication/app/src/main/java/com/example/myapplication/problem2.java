package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class problem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem2);

        Button button = findViewById(R.id.pr2_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solution();
            }
        });
    }

    public void solution(){
        EditText pr2_ET = findViewById(R.id.pr2_ET);
        TextView pr2_TV = findViewById(R.id.pr2_TV);

        long n = Long.parseLong(pr2_ET.getText().toString());
        long sum = 0;

        while(n >0){
            sum = sum + n % 10;
            n = n / 10;
        }

        pr2_TV.setText(sum+"");

    }
}