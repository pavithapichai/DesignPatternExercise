package com.company.designpattern.observer;

public class CurrentWeatherConditionObservers implements Observer,DisplayInterface{
    private float temperature;
    private float humidity;
    private float moisture;
    ISubject weatherData;
    public CurrentWeatherConditionObservers(ISubject data) {
        this.weatherData = data;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp,float humidity,float moisture) {
        this.moisture =moisture;
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
