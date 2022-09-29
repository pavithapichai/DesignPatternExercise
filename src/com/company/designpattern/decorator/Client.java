package com.company.designpattern.decorator;

import com.company.designpattern.decorator.abstractcomponent.Beverage;
import com.company.designpattern.decorator.componentconcrete.DarkRoastConcrete;
import com.company.designpattern.decorator.decotatorconcrete.MilkDecoratorConcrete;
import com.company.designpattern.decorator.decotatorconcrete.WhipDecoratorConcrete;
/*
Adding additonal resposibilites to object dynamically
  Decorator classes used to wrap concrete components
 it is adheres to open to extension and closed for modification

 Decorated classs wrap   abstractions type object
 Composition and delegation can often be used to add new behaviors at runtime.
 Extension acheived through composition

 but it also has it is dark side
    Decorators can result in many small objects in our design, and overuse can be complex

    Builder pattern and factory pattern reduce object instatiaon
 */
public class Client {
    public static void main(String[] args){
        Beverage beverage = new WhipDecoratorConcrete(new MilkDecoratorConcrete(new DarkRoastConcrete()));
        System.out.println(beverage.cost() +" "+beverage.getDescription());
    }
}
