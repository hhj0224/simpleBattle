package com.example.hjhwang.myapplication.model;

import java.util.List;

/**
 * Created by hjhwang on 2017-10-27.
 */

public class BattleGround {
    List<Unit> leftField;
    List<Unit> rightField;

    Referee referee;

    public void setUnit(Unit unit, int side){
        if(side == 1){
            this.leftField.add(unit);
        }
        else{
            this.rightField.add(unit);
        }
    }

    public void setReferee(Referee referee){
        this.referee = referee;
    }
}
