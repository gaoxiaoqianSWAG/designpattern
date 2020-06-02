package com.example.designpattern;

import android.text.TextUtils;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(TextUtils.isEmpty(shapeType)){
            return null;
        }
        if(shapeType.equals(Constants.CIRCLE)){
            return new CircleShape();
        }else if(shapeType.equals(Constants.RECTANGLE)){
            return new RectangleShape();
        }else if(shapeType.equals(Constants.SQUARE)){
            return new SquareShape();
        }

        return null;
    }
}
