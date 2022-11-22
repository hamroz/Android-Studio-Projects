package com.example.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      Exercise 1
        triangle();

//      Exercise 2
        Button clickMe = findViewById(R.id.btn);
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perArea();
            }
        });
    }

    public void triangle(){
        TextView res1TV = findViewById(R.id.res1TV);

        String store = "";
        for (int i = 0; i<6;i++){

            for (int j = 5; j >= i; j--) {
                store += " ";
            }

            for (int j=1; j<=i; j++){
                store += "* ";
            }
            store += "\n";

        }
        res1TV.setText(store);
    }

    public void perArea(){
        EditText aInput = findViewById(R.id.aInput);
        EditText bInput = findViewById(R.id.bInput);
        TextView perRes = findViewById(R.id.perRes);
        TextView areaRes = findViewById(R.id.areaRes);

        float a = Float.parseFloat(aInput.getText().toString());
        float b = Float.parseFloat(bInput.getText().toString());

        float peremeter = 2*a + 2*b;
        float area = a*b;

        perRes.setText(peremeter + "");
        areaRes.setText(area + "");

        }



}