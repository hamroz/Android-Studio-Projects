package com.example.hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    TextView textView;

//    public static final String EXTRA_MESSAGE = "com.example.variables.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editTextTextPersonName);
        textView=(TextView)findViewById(R.id.textView);
    }

    public void SendMessage(View view){
        String numbers=editText.getText().toString();
        int number = Integer.parseInt(numbers);
        String answer=" 0  1 ";

        int n1=0,n2=1,n3;
        while(n2<number)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            if (n2>number){
                break;
        }
            answer=answer+" "+ n3;
        }
        textView.setText(answer);


    }



    public void NestedLoops(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        startActivity(intent);
    }

    public void Strings(View view){
        Intent intent2 = new Intent(this, Nested.class);
        startActivity(intent2);
    }


}