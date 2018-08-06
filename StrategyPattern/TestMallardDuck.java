package com.recyan.StrategyPattern;

/**
 * Created by Yan_Jiang on 2018/8/6.
 */
public class TestMallardDuck {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();

        mallardDuck.performFly();
        mallardDuck.performQuack();

        //动态改变行为
        System.out.println("模拟后期需求需要变化");
        mallardDuck.setFlyBehavior(new FlyWithRocketPowered());
        mallardDuck.performFly();
    }

}
