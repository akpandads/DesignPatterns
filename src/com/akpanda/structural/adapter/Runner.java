package com.akpanda.structural.adapter;

public class Runner {
    public static void main(String[] args) {
        Square square = new Square(11);
        SquareToRectangleAdapter adapter = new SquareToRectangleAdapter(square);
        System.out.println("The square object is adapted into rectangle to call the rectangles get area method");
        System.out.println("Area: "+adapter.getArea());
    }
}
