package org.example.singletonPattern;

public class Singleton {

    private static Singleton firstInstance = null;
    private String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(firstInstance == null){
            firstInstance = new Singleton(value);
        }
        return firstInstance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
