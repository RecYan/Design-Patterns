package com.recyan.ObserverPattern;

/**
 * Created by Yan_Jiang on 2018/8/22.
 * 观察者模式测试
 */
public class ClientTest {

    public static void main(String[] args) {

        //1. 创建目标
        ConcereWeatherSubject weather = new ConcereWeatherSubject();

        //2. 创建观察者 设置相应状态
        ConcreateObserver observerGirl = new ConcreateObserver();
        observerGirl.setObserverName("girlfriend");
        observerGirl.setRemindInfo("meeting.....");

        ConcreateObserver observerMum = new ConcreateObserver();
        observerMum.setObserverName("mon");
        observerMum.setRemindInfo("shopping....");

        //3. 注册观察者
        weather.attach(observerGirl);
        weather.attach(observerMum);

        //4. 目标发布天气
        weather.setWeatherContent("good weather");

    }

}
