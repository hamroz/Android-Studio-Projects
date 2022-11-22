package com.example.practical_9;

public class Rectangle extends Shape{
    public Rectangle(double length, double breadth) {
        super(length, breadth);
        this.length = length;
        this.breadth = breadth;
    }
    int x;
    int y;

    public Rectangle(double length, double breadth, int x, int y) {
        super(length, breadth);
        this.x = x;
        this.y = y;
    }

    double area(){
        return breadth * length;
    }

    double perimetr(){
        return (2*length) + (2*breadth);
    }



}
