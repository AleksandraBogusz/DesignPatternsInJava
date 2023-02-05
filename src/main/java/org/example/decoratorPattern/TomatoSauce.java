package org.example.decoratorPattern;

public class TomatoSauce extends ToppingDecorator{

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost() + 0.25;
    }
}
