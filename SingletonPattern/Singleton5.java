package com.recyan.SingletonPattern;

/**
 * Created by Yan_Jiang on 2018/8/25.
 * 内部类实现延时加载
 */
public class Singleton5 {

    private Singleton5() {};

    // 私有内部类，按需加载，用时加载，即延迟加载
    private static class Holder {
        private static  Singleton5 instance = new Singleton5();
    }

    public static Singleton5 getInsatance() {
        return  Holder.instance;
    }

}
