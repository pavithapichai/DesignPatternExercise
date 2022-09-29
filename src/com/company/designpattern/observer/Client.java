package com.company.designpattern.observer;

public class Client {

    public static void main(String[] args) {
        //create the WeatherData object
        WeatherData weatherData = new WeatherData();
        CurrentWeatherConditionObservers conditionObservers = new CurrentWeatherConditionObservers(weatherData);


        StaticsWeatherObservers staticsWeatherData = new StaticsWeatherObservers(weatherData);
        weatherData.setMeasurements(78, 69, 28.4f);
    }
}
