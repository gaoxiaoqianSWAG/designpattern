package com.example.designpattern;

import android.util.Log;

public class SquareShape implements Shape {
    @Override
    public void draw() {
        Log.i("TAG", "SquareShape draw()");
    }
}
