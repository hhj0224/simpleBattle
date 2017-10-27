package com.example.hjhwang.myapplication.model;

/**
 * Created by hjhwang on 2017-10-27.
 */

public class Clock {
    int time = 0;
    public void start(){
        try {
            Thread.sleep(1000);
            this.time++;
        } catch (InterruptedException e) {

        }
    }

    public int getTime(){
        return this.time;
    }
}
