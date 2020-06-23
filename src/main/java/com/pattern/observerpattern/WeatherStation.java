package com.pattern.observerpattern;
//测试
public class WeatherStation {
    public static void main(String[] args) {
        WeatherDate weatherDate = new WeatherDate();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherDate);

        weatherDate.setMeasurements(80,65,30.4f);
        weatherDate.setMeasurements(82,70,30.4f);
        weatherDate.setMeasurements(78,90,30.4f);
    }
}
