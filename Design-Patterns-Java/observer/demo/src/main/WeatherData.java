package main;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData(){

        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer theObserver) {

        observers.add(theObserver);
    }

    @Override
    public void removeObservers(Observer theObserver) {

        observers.remove(theObserver);
    }

    @Override
    public void notifyObservers() {

        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }

    }

    public void measurementsChanged(){

        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }

    public float getTemperature() { return temperature; }
    public float getHumidity() { return humidity; }
    public float getPressure() { return pressure; }

}