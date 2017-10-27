package com.example.hjhwang.myapplication.model;

/**
 * Created by hjhwang on 2017-10-27.
 */

public final class AttackCalculator {
    public static void attack(Unit source, Unit target){
        target.hp -= source.att;
    }
}
