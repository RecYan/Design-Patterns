package com.recyan.JavaObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yan_Jiang on 2018/8/22.
 * 具体的观察者对象
 */
public class ConcreateObserver implements Observer{

    //观察者名称
    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    /**
     * 目标对象更新后 及时更新观察者对应的状态
     * @param o 目标引用 -- 拉模型
     * @param arg 推送的内容 -- 推模型
     */
    @Override
    public void update(Observable o, Object arg) {
        //1. 推方式
        System.out.println(observerName+" 收到了 "+arg);
        //2. 拉方式
        System.out.println(observerName+" 主动去目标对象中拉取信息 "+((ConcreateWeatherSubject)o).getWeatherContent());
    }
}
