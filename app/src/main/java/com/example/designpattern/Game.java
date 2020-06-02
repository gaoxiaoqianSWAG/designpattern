package com.example.designpattern;

public abstract class Game {
    //定义抽象方法
     abstract void initialize();
     abstract void startGame();
     abstract void endGame();

     //执行方式_模板
     public void play(){
         initialize();

         startGame();

         endGame();
     }

}
