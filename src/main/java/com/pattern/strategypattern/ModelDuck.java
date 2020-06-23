package com.pattern.strategypattern;

public class ModelDuck extends Duck {

    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.setQuackBehavior(new Quack());
        modelDuck.performQuack();
        modelDuck.setQuackBehavior(new Squeak());
        modelDuck.performQuack();
    }
}
