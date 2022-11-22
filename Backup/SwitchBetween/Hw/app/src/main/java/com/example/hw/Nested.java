package com.example.hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Nested extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested);

        editText1=(EditText)findViewById(R.id.editTextTextPersonName3);
        editText2=(EditText)findViewById(R.id.editTextTextPersonName4);
        editText3=(EditText)findViewById(R.id.editTextTextPersonName5);

        textView=(TextView)findViewById(R.id.textView5);
    }

    public void Sumup(View view) {
        String number1 = editText1.getText().toString();
        String number2 = editText2.getText().toString();
        String opr = editText3.getText().toString();
        char oper=opr.charAt(0);
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        double result=0.0;

        switch (oper) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                result=0.0;
                break;
        }
        String d= ""+result;
        textView.setText(d);

    }
    public void Fibb(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
    public void Nested(View view){
        Intent intent2 = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent2);
    }
}