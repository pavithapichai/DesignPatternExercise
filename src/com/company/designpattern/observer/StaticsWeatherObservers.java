package com.company.designpattern.observer;
/*
This one keeps track
of the min/avg/max
measurements and
displays them.
 */
public class StaticsWeatherObservers implements Observer,DisplayInterface{
    private float temperature;
    private float humidity;
    private float moisture;
    ISubject weatherData;
    public StaticsWeatherObservers(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg Temparature " + temperature
                + "F degrees");
    }

    @Override
    public void update(float temp, float humidity, float moisture) {
        this.moisture =moisture;
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
