package com.recyan.AdapterPattern;

/**
 * Created by Yan_Jiang on 2018/11/29.
 * 3. 实现mp3接口的适配器类
 */
public class MediaAdapter implements MediaPlayer {


    AdvancedMediaPlayer advancedMusicPlayer; //高级适配

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
