package main;

public interface SubjectStockMarket {

    public void register(ObserverStockMarket o);
    public void unregister(ObserverStockMarket o);
    public void notifyObserver();




}
