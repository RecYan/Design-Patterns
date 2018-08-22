package com.recyan.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yan_Jiang on 2018/8/22.
 * 目标对象 提供注册(添加)和删除观察者的方法
 */
public class WeatherSubject {

    //定义一个观察者列表集合 来存储注册的观察者对象 --订阅天气者列表
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 注册观察者 添加订阅者到列表中
     * @param observer 需要注册的观察者
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 从观察者列表中删除指定的观察者
     * @param observer 需要删除的观察者
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 目标对象状态改变时 通知所有观察者及时更新状态
     */
    protected void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }


}
