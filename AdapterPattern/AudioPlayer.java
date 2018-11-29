package com.recyan.AdapterPattern;

/**
 * Created by Yan_Jiang on 2018/11/29.
 * 4. 实现mp3接口的实体类  -- 已经适配好了 提供给客户使用
 */
public class AudioPlayer implements MediaPlayer{


    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("mp3播放器："+ fileName);
        }
        //mediaAdapter 调用适配器来提供mp4格式的支持
        else if(audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
