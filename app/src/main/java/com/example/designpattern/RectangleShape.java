package com.example.designpattern;

import android.util.Log;

public class RectangleShape implements Shape {
    @Override
    public void draw() {
        Log.i("TAG", "RectangleShape draw()");
    }
}
