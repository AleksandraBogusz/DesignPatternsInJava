package org.example.decoratorPattern;

public class Mozarella extends ToppingDecorator{

    public Mozarella(Pizza tempPizza) {
        super(tempPizza);
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }
}
