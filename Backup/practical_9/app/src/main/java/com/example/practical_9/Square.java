package com.example.practical_9;

public class Square extends Shape{
    public Square(double length, double breadth) {
        super(length, breadth);
    }

    double area(){
        return length*length;
    }

    double perimetr(){
        return 4*length;
    }
}
