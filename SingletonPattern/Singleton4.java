package com.recyan.SingletonPattern;

/**
 * Created by Yan_Jiang on 2018/8/25.
 * synchronied代码块
 */
public class Singleton4 {

    //1.构造函数私有化，禁止外部访问
    private Singleton4() {

    }

    //2.声明静态的类实例，但不初始化
    private static Singleton4 instance;

    //3.对外提供静态的get方法来获取实例
    public static  Singleton4 getInstance() {
        //使用同步代码块
        synchronized (Singleton4.class) {
            //3.1加入判断 没有实例时才创建
            if(instance == null) {
                instance = new Singleton4();
            }
        }

        return instance;
    }
}
