package com.example.lld.designPatterns.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();//concrete subject
        Observer observer = new CurrentStatsDisplay(weatherData);
        weatherData.setWeatherData(23.0f, 45.0f, 12.0f);
        weatherData.setWeatherData(23.0f, 45.0f, 12.0f);//no update for same data
        weatherData.setWeatherData(26.0f, 55.0f, 15.0f);// update for new data
        weatherData.removeObserver(observer);
        weatherData.setWeatherData(27.0f, 55.0f, 15.0f);//no update after observer gets removed
    }
}
