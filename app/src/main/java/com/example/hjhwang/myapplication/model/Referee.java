package com.example.hjhwang.myapplication.model;

/**
 * Created by hjhwang on 2017-10-27.
 */

public class Referee {
    Clock clock;

    private void startBattle(){
        this.clock.start();
    }

    public void tweet(String message){
        System.out.println(message);
    }
}
