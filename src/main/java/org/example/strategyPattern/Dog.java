package org.example.strategyPattern;

public class Dog extends Animal{

    public Dog() {
        super();
        flyingType = new CantFly();
    }
}
