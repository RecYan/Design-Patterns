package com.recyan.SingletonPattern;

/**
 * Created by Yan_Jiang on 2018/8/24.
 * 测试用例
 */
public class TestClient {

    public static void main(String[] args) {

        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        System.out.println(s1==s2); //true

        Singleton1 s3 = Singleton1.getInstance();
        Singleton1 s4 = Singleton1.getInstance();

        System.out.println(s3==s4); //true


    }


}
