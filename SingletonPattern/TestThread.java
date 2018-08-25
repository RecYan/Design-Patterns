package com.recyan.SingletonPattern;

/**
 * Created by Yan_Jiang on 2018/8/24.
 * 多线程情况下 懒汉式及其变种安全性测试
 */
public class TestThread extends Thread {
    @Override
    public void run() {

        //打印不同懒汉式实例的hashcode值
        int hashCode = Singleton7.getInstance().hashCode();
        System.out.println("hashCode: "+hashCode);
    }
}
