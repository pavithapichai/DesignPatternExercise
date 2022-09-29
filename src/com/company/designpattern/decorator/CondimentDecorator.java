package com.company.designpattern.decorator;

import com.company.designpattern.decorator.abstractcomponent.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    @Override
    public double cost() {
        return 0;
    }
}
