package org.example.observerPattern;

import org.example.observerPattern.Interfaces.Observer;
import org.example.observerPattern.Interfaces.Subject;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGraber;

    public StockObserver(Subject stockGraber) {
        this.stockGraber = stockGraber;
        this.observerID = ++observerIDTracker;

        stockGraber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = applPrice;
    }

    public double getIbmPrice() {
        return ibmPrice;
    }

    public double getAaplPrice() {
        return aaplPrice;
    }

    @Override
    public String toString() {
        return "StockObserver{" +
                "ibmPrice=" + ibmPrice +
                ", aaplPrice=" + aaplPrice +
                ", observerID=" + observerID +
                ", stockGraber=" + stockGraber +
                '}';
    }
}
