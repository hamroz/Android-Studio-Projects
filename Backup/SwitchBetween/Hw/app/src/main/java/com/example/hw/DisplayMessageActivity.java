package com.example.hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        editText=(EditText)findViewById(R.id.editTextTextPersonName2);
        textView=(TextView)findViewById(R.id.textView3);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    public void Nested(View view){
        String numbers=editText.getText().toString();
        int number = Integer.parseInt(numbers);
        String nest="";
        int  i = number, j = 1;
        while (i > 0) {
            while (j <= i) {
                nest+="*";
                j++;
            }
            nest+="\n";
            i--;
            j = 1;
        }
        textView.setText(nest);

    }

    public void Fibonacci(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void Calculator(View view){
        Intent intent = new Intent(this, Nested.class);
        startActivity(intent);
    }
}