package com.example.designpattern;

import android.util.Log;

public class Cs extends Game {
    @Override
    void initialize() {
        Log.i("TAG", "Cs initialize");
    }

    @Override
    void startGame() {
        Log.i("TAG", "Cs startGame");
    }

    @Override
    void endGame() {
        Log.i("TAG", "Cs endGame");
    }
}
