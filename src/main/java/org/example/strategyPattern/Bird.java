package org.example.strategyPattern;

public class Bird extends Animal{

    public Bird() {
        super();
        flyingType = new CantFly();
    }
}
