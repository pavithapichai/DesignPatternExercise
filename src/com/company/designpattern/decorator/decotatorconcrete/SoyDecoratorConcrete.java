package com.company.designpattern.decorator.decotatorconcrete;


import com.company.designpattern.decorator.CondimentDecorator;
import com.company.designpattern.decorator.abstractcomponent.Beverage;

public class SoyDecoratorConcrete extends CondimentDecorator {

    Beverage beverage;

    public SoyDecoratorConcrete(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Soy";
    }
    @Override
    public double cost() {
        return beverage.cost()+0.15;
    }
}