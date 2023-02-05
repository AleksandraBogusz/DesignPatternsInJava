package org.example.strategyPattern;

public class Animal {
    public Flys flyingType;

    public boolean getFlyingType() {
        return flyingType.fly();
    }

    public void setFlyingType(Flys flyingType) {
        this.flyingType = flyingType;
    }
}
