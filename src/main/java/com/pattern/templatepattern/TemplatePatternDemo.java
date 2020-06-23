package com.pattern.templatepattern;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        LolGame lolGame = new LolGame();
        lolGame.play();
        System.out.println();
        CrossFire crossFire = new CrossFire();
        crossFire.play();
    }
}
