package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class exercise3 extends AppCompatActivity {
    EditText input1;
    EditText input2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        result = findViewById(R.id.result);
    }

    public void calc(View view){
        String problem = String.valueOf(input1.getText());
        String[] problem2 = String.valueOf(input2.getText()).split((" "));
        String solution = "";

        if(isPalindrome(problem)){
            solution += "Number " + problem + " is true palindrome\n";
        }else{
            solution += "Number " + problem + " is false palindrome\n";
        }

        if(isLex(problem2)){
            solution += "Lexicographically increasing order is true";
        }else{
            solution += "Lexicographically increasing order is false";
        }

        result.setText(solution);

    }

    static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isLex(String[] str){
        for(int i=0; i < str.length-1; i++){
            int compare = str[i].compareTo(str[i+1]);
            if (compare < 0 || compare == 0) {
                System.out.println("pass");
            } else {
                return false;
            }
        }
        return true;
    }
}