package com.recyan.StrategyPattern;

/**
 * Created by Yan_Jiang on 2018/8/6.
 */
public class FlyWithRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!!");
    }
}
