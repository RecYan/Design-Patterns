package com.recyan.SingletonPattern;

/**
 * Created by Yan_Jiang on 2018/8/24.
 * 单例模式实现 -- 饿汉式
 */
public class Singleton1 {

    //1. 将构造方法私有化，不允许外部直接创建对象
    private Singleton1() {

    }

    /**2.创建类的唯一实例 且不对外暴露 ---> 外部不能通过类名.成员变量名来获取 ---> 提供对外的类get方法来解决该问题
     *  成员变量被static修饰，随着类的加载而加载 所以被称为饿汉式
     */
    private static Singleton1 instance = new Singleton1();

    //3.对外提供类get实例方法来获取实例
    public static Singleton1 getInstance() {
        return instance;
    }
}
