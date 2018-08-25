package com.recyan.SingletonPattern;

/**
 * Created by Yan_Jiang on 2018/8/24.
 * synchronized同步函数式懒汉式
 */
public class Singleton3 {

    //1.构造函数私有化，禁止外部访问
    private Singleton3() {

    }

    //2.声明静态的类实例，但不初始化
    private static Singleton3 instance;

    //3.对外提供静态的get方法来获取实例
    public static synchronized Singleton3 getInstance() {
        //3.1加入判断 没有实例时才创建
        if(instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
