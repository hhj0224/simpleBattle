package com.example.hjhwang.myapplication.model;

/**
 * Created by hjhwang on 2017-10-27.
 */

public class Unit {
    int att;
    int def;
    int spd;
    int agil;
    int dex;
    public int hp;

    public Unit(int att, int def, int spd, int agil, int dex, int hp){
        this.att = att;
        this.def = def;
        this.spd = spd;
        this.agil = agil;
        this.dex = dex;
        this.hp = hp;
    }

    private void attack(Unit enemy){
        AttackCalculator.attack(this, enemy);
    }
}
