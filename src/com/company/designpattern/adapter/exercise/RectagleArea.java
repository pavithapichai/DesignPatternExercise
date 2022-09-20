package com.company.designpattern.adapter.exercise;

public class RectagleArea {

    public int getArea(IRectangle iRectangle){
        return iRectangle.getWidth()* iRectangle.getHeight();
    }
}
