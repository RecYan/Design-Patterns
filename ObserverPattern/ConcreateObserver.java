package com.recyan.ObserverPattern;

/**
 * Created by Yan_Jiang on 2018/8/22.
 * 具体的观察者对象 实现更新的方法 是自身状态和目标状态保持一致
 */
public class ConcreateObserver implements Observer {

    //观察者状态--订阅者名称
    private String observerName;

    //天气内容 -- 目标处获取
    private String weatherContent;

    //提醒的内容  女朋友提醒约会  妈妈提醒购物
    private String remindInfo;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindInfo() {
        return remindInfo;
    }

    public void setRemindInfo(String remindInfo) {
        this.remindInfo = remindInfo;
    }

    /**
     * 获取目标对象状态 并同步到观察者对象状态中 使两者保持同步
     * @param weatherSubject 传入的目标对象 方便观察者从中获取目标对象改变的状态
     */
    @Override
    public void update(WeatherSubject weatherSubject) {
        weatherContent = ((ConcereWeatherSubject) weatherSubject).getWeatherContent();
        System.out.println(observerName+" 收到了 "+weatherContent+" , "+remindInfo);
    }


}
