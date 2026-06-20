package com.example.lld.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;

    List<Observer> observerList;

    public WeatherData(){
        this.observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Added observer");
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Removed observer");
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : this.observerList){
            o.update(this.temperature, this.pressure, this.humidity);
        }
    }

    public void setWeatherData(float temperature, float pressure, float humidity){
        if(this.temperature != temperature || this.pressure != pressure || this.humidity != humidity){
            this.temperature = temperature;
            this.pressure = pressure;
            this.humidity = humidity;
            notifyObserver();
        }
    }
}
