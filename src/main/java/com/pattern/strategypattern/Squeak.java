package com.pattern.strategypattern;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("squeak 吱吱叫");
    }
}
