package com.example.hash_map;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onButtonClick(View view){
        TextView textView = findViewById(R.id.textView);

        Map vehicles = new HashMap();

//        Add some vehicles

        vehicles.put("Mercedes", 3);
        vehicles.put("BMW",5);
        vehicles.put("Ford",10);
        vehicles.put("Tesla",9);
        vehicles.put("Audi",4);


        textView.setText("Total vehicles: "+vehicles.size());

//        Iterate over all vehicles using the keySet method
        for(Object key: vehicles.keySet()){
            textView.setText(textView.getText() + "\r\n" + key + " - " + vehicles.get(key));
        }

        String searchKey = "Tesla";

        if(vehicles.containsKey(searchKey)){
            textView.setText(textView.getText() +"\r\n" + "Found total " + vehicles.get(searchKey) + " " + searchKey + " cars");
        }

        vehicles.clear();

        textView.setText(textView.getText() + "\r\n" + "After clear operation, size: " + vehicles.size());



    }
}