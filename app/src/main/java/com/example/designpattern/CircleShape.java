package com.example.designpattern;

import android.util.Log;

public class CircleShape implements Shape {
    @Override
    public void draw() {
        Log.i("TAG", "CircleShape draw()");
    }
}
