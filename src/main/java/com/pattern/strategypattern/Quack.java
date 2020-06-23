package com.pattern.strategypattern;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("quack 呱呱叫");
    }
}
