package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class exercise2 extends AppCompatActivity {

    EditText editText;
    TextView textView;
    ImageView imageView;
    Map<String, String> cars = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        editText = findViewById(R.id.carName);
        textView = findViewById(R.id.info);
        imageView = findViewById(R.id.imageView);

        cars.put("cadillacName", "Cadillac Escalade");
        cars.put("cadillacSpeed", "Speed: 230mph");
        cars.put("cadillacPower", "Horsepower: 682hp");

        cars.put("mclarenName", "McLaren P3 ");
        cars.put("mclarenSpeed", "Speed: 217mph");
        cars.put("mclarenPower", "Horsepower: 903hp");

        cars.put("bugattiName", "Bugatti Chiron");
        cars.put("bugattiSpeed", "Speed: 304mph");
        cars.put("bugattiPower", "Horsepower: 1500hp");

        cars.put("teslaName", "Tesla Model X");
        cars.put("teslaSpeed", "Speed: 670mph");
        cars.put("teslaPower", "Horsepower: 283 bhp");

        cars.put("rollsName", "Rolls Royce Phantom");
        cars.put("rollsSpeed", "Speed: 155mph");
        cars.put("rollsPower", "Horsepower: 563hp");

    }

    @SuppressLint("SetTextI18n")
    public void giveInfo(View view) {
        String car = String.valueOf(editText.getText());

        String r = cars.get(car + "Name") + "\n" +
                cars.get(car + "Speed") + "\n" +
                cars.get(car + "Power") + "\n";

        System.out.println(r);
        switch (car) {
            case "cadillac":
                imageView.setImageResource(R.drawable.cadillac);
                break;
            case "bugatti":
                imageView.setImageResource(R.drawable.bugatti);
                break;
            case "mclaren":
                imageView.setImageResource(R.drawable.mclaren);
                break;
            case "tesla":
                imageView.setImageResource(R.drawable.tesla);
                break;
            case "rolls":
                imageView.setImageResource(R.drawable.rolce);
                break;
        }
        textView.setText(r);
    }


}
