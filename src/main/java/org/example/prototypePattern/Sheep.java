package org.example.prototypePattern;

public class Sheep implements Animal{

    public Sheep() {
    }

    @Override
    public Animal makeCopy() throws CloneNotSupportedException {
        Sheep sheepObject = null;
        sheepObject = (Sheep) super.clone();
        return sheepObject;
    }

    @Override
    public String toString() {
        return "Sheep";
    }
}
