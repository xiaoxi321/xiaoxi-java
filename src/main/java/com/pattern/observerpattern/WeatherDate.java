package com.pattern.observerpattern;

import java.util.ArrayList;

//具体的主题 天气
public class WeatherDate implements Subject {

    private ArrayList<Observer> observerList;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherDate() {
        this.observerList = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observerList.indexOf(o);
        if(i>0){
            observerList.remove(o);
        }
    }

    public void notifyObserver() {
        for (Observer observer : observerList){
            observer.update(temperature,humidity,pressure);
        }
    }

    //设置测量
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //测量值更改
    private void measurementsChanged() {
        notifyObserver();
    }
}
