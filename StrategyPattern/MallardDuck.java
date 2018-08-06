package com.recyan.StrategyPattern;

/**
 * Created by Yan_Jiang on 2018/8/6.
 */
public class MallardDuck extends Duck {

    public  MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("i am a MallardDuck");
    }
}
