package com.example.gamedevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    Button writeBtn, readBtn;
    TextView text1;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        writeBtn = findViewById(R.id.write);
        input = findViewById(R.id.input);
        text1 = findViewById(R.id.text1);
        readBtn = findViewById(R.id.read);

        writeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = input.getText().toString();
                writeToFile("file.txt", content);
            }
        });

        readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
        public void writeToFile(String fileName, String content){
            File path = getApplicationContext().getFilesDir();
            try {
                FileOutputStream writer = new FileOutputStream(new File(path, fileName));
                writer.write(content.getBytes());
                writer.close();
                Toast.makeText(getApplicationContext(), "Wrote to file: " + fileName, Toast.LENGTH_SHORT).show();
            } catch (Exception e){
                e.printStackTrace();
            }

        }










}