package com.recyan.SingletonPattern;

/**
 * Created by Yan_Jiang on 2018/8/24.
 * 单例模式--懒汉式
 */
public class Singleton2 {

    //1.构造函数私有化，禁止外部访问
    private Singleton2() {

    }

    //2.声明静态的类实例，但不初始化
    private static Singleton2 instance;

    //3.对外提供静态的get方法来获取实例
    public static Singleton2 getInstance() {
        //3.1加入判断 没有实例时才创建
        /** !!!Attention!!!
         * 多线程情况下：
         * 会有多个线程同时进入 if (singleton2 == null) {…} 语句块的情形发生。当这种这种情形发生后，该单例类就会创建出多个实例
         */
        if(instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
