package com.company.designpattern.adapter.solutions;

//interface Adapts into subclass form
/*
Adapter lets classes work together that could not compatible
Incompatible interface
Interface Adapts it to subclass form
converts interface of the class into different form

When to use?
It is used when you dont want modify existing resource
It is make existing classes work with other class
 */
public class SquareAdaptsToRectangle implements IRectangle {
   private Square sq;

    public SquareAdaptsToRectangle(Square sq) {
        this.sq = sq;
    }


    @Override
    public int getHeight() {
        return sq.getSide();
    }

    @Override
    public int getWidth() {
        return sq.getSide();
    }

}
