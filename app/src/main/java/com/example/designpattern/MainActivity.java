package com.example.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //单例模式
        //SingletonInstance.getInstance().fun();

        //工厂模式
        /*ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape(Constants.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(Constants.RECTANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(Constants.SQUARE);
        shape3.draw();*/

        //模板模式
        /*Game game = new FootBall();
        game.play();

        game=new Cs();
        game.play();*/

        //构建者模式
        Computer computer = new Computer.Bulider()
                .setName("华硕")
                .setOs("windown")
                .setPrince(4500)
                .setColor(123)
                .build();
        Log.e("TAG", computer.toString());


    }
}
