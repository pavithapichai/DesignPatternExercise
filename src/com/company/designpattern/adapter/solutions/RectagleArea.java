package com.company.designpattern.adapter.solutions;

public class RectagleArea {

    public int getArea(IRectangle iRectangle){
        return iRectangle.getWidth()* iRectangle.getHeight();
    }
}
