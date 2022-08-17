package com.example.cleancode.chapter6.object;

import com.example.cleancode.chapter6.sequential.Point;

public class Circle implements Shape{
    public Point center;
    public double radius;
    public static final double PI = 3.141592;

    @Override
    public double area() {
        return PI * radius * radius;
    }
}
