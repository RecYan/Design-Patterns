package com.recyan.ObserverPattern;

/**
 * Created by Yan_Jiang on 2018/8/22.
 * 具体的目标对象  负责将有关状态存入到相应的观察者中
 */
public class ConcereWeatherSubject extends WeatherSubject {

    //具体天气内容
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers(); //状态改变时候 需要及时通知  需要补充
    }
}
