package com.pattern.observerpattern;

//目前状况布告板 具体观察者
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    public void display() {
        System.out.println("当前状况： "+ temperature + "F 度数和湿度 "+ humidity+"% humidity");
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
