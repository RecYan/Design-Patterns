package com.recyan.StrategyPattern;

/**
 * Created by Yan_Jiang on 2018/8/6.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
