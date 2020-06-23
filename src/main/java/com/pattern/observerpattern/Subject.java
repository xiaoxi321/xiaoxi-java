package com.pattern.observerpattern;

//主题
public interface Subject {
    //注册观察者
    public void registerObserver(Observer o);
    //移除观察者
    public void removeObserver(Observer o);
    //主题改变时通知所有观察者
    public void notifyObserver();
}
