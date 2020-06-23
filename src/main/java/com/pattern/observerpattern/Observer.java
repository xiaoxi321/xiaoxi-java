package com.pattern.observerpattern;

//观察者
public interface Observer {
    //修改温度，湿度，气压
    public void update(float temp,float humidity,float pressure);
}

