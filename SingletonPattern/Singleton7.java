package com.recyan.SingletonPattern;

/**
 * Created by Yan_Jiang on 2018/8/25.
 * ThreadLocal单例变体
 *      将临界资源线程局部化，将双重检测的第一层检测条件 if (instance == null) 转换为 线程局部范围内的操作 。
 *      这里的 ThreadLocal 也只是用作标识而已，用来标识每个线程是否已访问过：如果访问过，则不再需要走同步块
 *      临界资源线程局部化
 */
public class Singleton7 {
    // ThreadLocal 线程局部变量
    private static ThreadLocal<Singleton7> threadLocal = new ThreadLocal<Singleton7>();
    private static Singleton7 instance = null;

    private Singleton7(){};

    public static Singleton7 getInstance(){

        if (threadLocal.get() == null) {      // 第一次检查：该线程是否第一次访问
            synchronized (Singleton7.class) {
                if (instance == null) {          // 第二次检查：该单例是否被创建
                    instance = new Singleton7();   // 只执行一次
                }
            }
            threadLocal.set(instance);      // 将单例放入当前线程的局部变量中
        }
        return instance;
    }

}


