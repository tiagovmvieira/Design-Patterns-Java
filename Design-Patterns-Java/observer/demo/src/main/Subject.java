package main;

public interface Subject {

    public void registerObserver(Observer theObserver);

    public void removeObservers(Observer theObserver);

    public void notifyObservers();

}
