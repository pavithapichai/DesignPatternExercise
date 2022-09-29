package com.company.designpattern.decorator.abstractcomponent;


public abstract class Beverage {
    private String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public void setDescription(String desc){
        description = desc;
    }
    public abstract double cost();
}