package com.example.hjhwang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hjhwang.myapplication.model.BattleGround;
import com.example.hjhwang.myapplication.model.Unit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Unit ally1 = new Unit(1, 2, 2, 3, 5, 10);
//        Unit ally2 = new Unit();
//        Unit ally3 = new Unit();
//        Unit ally4 = new Unit();

        Unit enemy1 = new Unit(1, 2, 2, 3, 5, 10);
//        Unit enemy2 = new Unit();
//        Unit enemy3 = new Unit();
//        Unit enemy4 = new Unit();

        BattleGround bg = new BattleGround();

        bg.setUnit(ally1, 1);
        bg.setUnit(enemy1, 0);


    }
}
