package org.example.observerPattern.Interfaces;

import org.example.observerPattern.Interfaces.Observer;

public interface Subject {

    public  void register(Observer o);

    public void unregister(Observer o);

    public void notifyObserver();
}
