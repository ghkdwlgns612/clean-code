package com.example.cleancode.chapter6.sequential;

public class Geometry {
    public static final double PI = 3.141592;

    public double area(Object shape) throws NoSuchMethodException {
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return s.side * s.side;
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.height * r.width;
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return c.radius * c.radius * PI;
        }
        throw new NoSuchMethodException();
    }
}
