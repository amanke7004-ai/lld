package com.example.lld.designPatterns.observer;

public class CurrentStatsDisplay implements Display, Observer{

    private float temperature;
    private float pressure;
    private float humidity;

    Subject subject;

    public CurrentStatsDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);//adding / registering  observer in the subject they've chosen to get data from
    }


    @Override
    public void display() {
        String displayText = "CurrentStatsDisplay{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
        System.out.println(displayText);
    }



    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
