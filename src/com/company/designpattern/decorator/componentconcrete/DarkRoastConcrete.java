package com.company.designpattern.decorator.componentconcrete;

import com.company.designpattern.decorator.abstractcomponent.Beverage;

public class DarkRoastConcrete extends Beverage {
    public DarkRoastConcrete() {
        setDescription("Dark roast");

    }

    @Override
    public double cost() {
        return 1.99;
    }
}
