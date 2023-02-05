package org.example.observerPattern;

import org.example.observerPattern.Interfaces.Observer;
import org.example.observerPattern.Interfaces.Subject;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;

    public StockGrabber() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int indexObserver = observers.indexOf(o);
        observers.remove(indexObserver);
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach(o -> o.update(ibmPrice, aaplPrice));
    }

    public void setIbmPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAaplPrice(double newApplPrice) {
        this.aaplPrice = newApplPrice;
        notifyObserver();
    }


}
