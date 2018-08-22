package com.recyan.ObserverPattern;

/**
 * Created by Yan_Jiang on 2018/8/22.
 * 观察者接口 提供一个update方法 当目标对象改变时 及时进行状态更新
 */
public interface Observer {

    /**
     * 更新状态接口
     * @param weatherSubject 传入的目标对象 方便观察者从中获取目标对象改变的状态
     */
    void update(WeatherSubject weatherSubject);
}
