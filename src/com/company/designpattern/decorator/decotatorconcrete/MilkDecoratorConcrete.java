package com.company.designpattern.decorator.decotatorconcrete;


import com.company.designpattern.decorator.CondimentDecorator;
import com.company.designpattern.decorator.abstractcomponent.Beverage;

public class MilkDecoratorConcrete extends CondimentDecorator {

    Beverage beverage;

    public MilkDecoratorConcrete(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Milk";
    }
    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }
}