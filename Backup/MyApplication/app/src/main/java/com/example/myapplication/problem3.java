package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class problem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem3);

        Button button = findViewById(R.id.pr3_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solution();
            }
        });
    }

    public void solution() {
        EditText pr3_ET = findViewById(R.id.pr3_ET);
        TextView pr3_TV = findViewById(R.id.pr3_TV);

        double n = Double.parseDouble(pr3_ET.getText().toString());
        double tax = 0, trial = 3;

        if (n >= 20000){
            for (int i = 0; i < trial; i++){
                if (i == 0){
                    if (n >= 20000){
                        tax += 0;
                        n -= 20000;
                        continue;
                    }else{
                        continue;
                    }
                }
                else if(i==1){
                    if (n >= 20000){
                        tax += 2000;
                        n -= 20000;
                        continue;
                    }else{
                        tax += n * 0.1;
                        n = 0;
                        continue;
                    }
                }
                else if(i==2){
                    if (n >= 20000){
                        tax += 4000;
                        n -= 20000;
                        continue;
                    }else{
                        tax += n * 0.2;
                        n = 0;
                        continue;
                    }
                }
            }
            tax = tax + (n * 0.3);
            pr3_TV.setText("The income tax payable is " + tax);
        }
        else {
            tax = 0;
            pr3_TV.setText("The income tax payable is " + tax);
        }
    }
}