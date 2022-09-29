package com.company.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/*

The ISubject class keeps
track of all your observers
and notifies them for you.
 */

public class WeatherData implements ISubject {
    private float temperature;

    private float humidity;

    private float pressure;
    private List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {

        if (observerList.size() > 0) {
            int index = observerList.indexOf(observer);
            observerList.remove(index);
        }

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList)
            observer.update(temperature, humidity, pressure);
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        measurementChanged();
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        measurementChanged();
    }

    public void setMoisture(float moisture) {
        this.pressure = moisture;
        measurementChanged();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
    
}
