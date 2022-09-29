package com.company.designpattern.decorator.componentconcrete;

import com.company.designpattern.decorator.abstractcomponent.Beverage;

public class HouseBlendConcrete extends Beverage {
    public HouseBlendConcrete() {
        setDescription("House blend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
