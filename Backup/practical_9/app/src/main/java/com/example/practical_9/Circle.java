package com.example.practical_9;

import static java.lang.Math.pow;

public class Circle extends Shape{
    public Circle(double length, double breadth) {
        super(length, breadth);
    }

    double radius;

    public Circle(double length, double breadth, double radius) {
        super(length, breadth);
        this.radius = radius;
    }

    double area(){
        return 3.14*pow(radius,2);
    }

    double circumference(){
        return 2*3.14*radius;
    }
}
