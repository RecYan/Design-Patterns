package com.recyan.SingletonPattern;



/**
 * Created by Yan_Jiang on 2018/8/24.
 * 多线程安全性测试
 */
public class TestClient2 {

    public static void main(String[] args) {

        //开启10个线程测试
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new TestThread();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

    }

}
//-----------------------------------------------
/**1. 普通懒汉式
 * hashCode: 1467113017
   hashCode: 1482530377
   hashCode: 1482530377
 */
/**2. synchronied函数懒汉式
 * hashCode: 1467113017
 hashCode: 1467113017
 hashCode: 1467113017
 */
/**2. synchronied代码块懒汉式
 * hashCode: 1354574556
 hashCode: 1354574556
 hashCode: 1354574556
 */

