package com.recyan.JavaObserverPattern;

import java.util.Observable;

/**
 * Created by Yan_Jiang on 2018/8/22.
 * 使用java内置观察者模式来实现 使用推模型
 */
public class ConcreateWeatherSubject extends Observable {

    //天气信息
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        //通知所有观察者
        // 1.通知之前需要先Changed()
        this.setChanged();
        // 2. 拉模型
        this.notifyObservers();
    }
}
