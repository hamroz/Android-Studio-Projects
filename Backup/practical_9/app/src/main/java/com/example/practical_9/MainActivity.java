package com.example.practical_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callTheMethods();
            }
        });
    }

    public void callTheMethods(){
        TextView res1 = findViewById(R.id.res1);
        Rectangle rec = new Rectangle(10,30);
        double area = rec.area();
        double perimetr = rec.perimetr();
        res1.setText("rectangle w="+rec.length+" h="+rec.breadth+" \narea="+area+"\nperimetr="+perimetr);

        TextView res2 = findViewById(R.id.res2);
        Circle circle = new Circle(10,0,3);
        double area1 = circle.area();
        double circumference = circle.circumference();
        res2.setText("circle r="+circle.radius+"\narea="+area1+"\ncircumference="+circumference);

        TextView res3 = findViewById(R.id.res3);
        Square square = new Square(5,0);
        double area3 = square.area();
        double perimetr2 = square.perimetr();
        res3.setText("square r="+square.length+"\narea="+area3+"\nperimetr="+perimetr2);


    };
    };



