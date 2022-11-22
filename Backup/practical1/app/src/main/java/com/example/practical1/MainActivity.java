package com.example.practical1;

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

        Button btn = findViewById(R.id.calcButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc();
            }
        });


    }

    public void calc(){
        EditText aEditText = findViewById(R.id.aEditText);
        EditText bEditText = findViewById(R.id.bEditText);
        TextView resultTextView = findViewById(R.id.resultTextView);

        float a = Float.parseFloat(aEditText.getText().toString());
        float b = Float.parseFloat(bEditText.getText().toString());

        float result = a + b;
        System.out.println(result);
        resultTextView.setText(result + "");

    }

}