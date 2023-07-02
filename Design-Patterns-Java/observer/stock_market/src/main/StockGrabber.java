package main;

import java.util.ArrayList;


public class StockGrabber implements SubjectStockMarket{

    private ArrayList<ObserverStockMarket> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){

        observers = new ArrayList<ObserverStockMarket>();
    }


    @Override
    public void register(ObserverStockMarket newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(ObserverStockMarket deleteObserver) {

        int observerIndex = observers.indexOf(deleteObserver);

        System.out.println("Observer " + (observerIndex + 1) + " deleted");
        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {

        for(ObserverStockMarket observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }

    }

    public void setIBMPrice(double newIBMPrice){

        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice){

        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice){

        this.googPrice = newGOOGPrice;
        notifyObserver();
    }

}
