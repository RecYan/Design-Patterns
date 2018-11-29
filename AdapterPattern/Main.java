package com.recyan.AdapterPattern;

/**
 * Created by Yan_Jiang on 2018/11/29.
 * 运行测试
 *
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "My Heart Will Go On.mp3");
        audioPlayer.play("mp4", "love.mp4");

    }
}
