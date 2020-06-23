package com.pattern.strategypattern;

public abstract class Duck {
    private QuackBehavior quackBehavior;


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }
}
