package com.company.designpattern.adapter.solutions;

public class Demo {
    public static void main(String... args){
        Square square = new Square(5);
        IRectangle squareAdaptsToRectangle = new SquareAdaptsToRectangle(square);
        RectagleArea arean = new RectagleArea();
        arean.getArea(squareAdaptsToRectangle);

        System.out.println(squareAdaptsToRectangle.getHeight());
        System.out.println(squareAdaptsToRectangle.getWidth());

    }
}
