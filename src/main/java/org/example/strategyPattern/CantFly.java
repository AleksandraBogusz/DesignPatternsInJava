package org.example.strategyPattern;

class CantFly implements Flys {

    @Override
    public boolean fly() {
        return false;
    }
}
