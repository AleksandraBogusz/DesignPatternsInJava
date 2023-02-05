package org.example.prototypePattern;

public interface Animal extends Cloneable{

    public Animal makeCopy() throws CloneNotSupportedException;
}
