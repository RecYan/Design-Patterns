package com.recyan.AdapterPattern;

/**
 * Created by Yan_Jiang on 2018/11/29.
 * 2. 播放mp4的实体类
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("mp4播放器："+ fileName);
    }
}
