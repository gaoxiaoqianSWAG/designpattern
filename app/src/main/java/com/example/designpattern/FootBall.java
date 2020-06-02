package com.example.designpattern;

import android.util.Log;

public class FootBall extends Game {

    @Override
    void initialize() {
        Log.i("TAG", "FootBall initialize");
    }
    @Override
    void startGame() {
        Log.i("TAG", "FootBall startGame");
    }

    @Override
    void endGame() {
        Log.i("TAG", "FootBall endGame");
    }

}
