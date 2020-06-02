package com.example.designpattern;

import android.util.Log;

/*
* 双检锁单例
* */
public class SingletonInstance {
    //变量
    private static volatile SingletonInstance instance;
    //私有化构造
    private SingletonInstance(){}
    //提供公共访问方式


    public static SingletonInstance getInstance() {
        if(instance==null){
            synchronized (SingletonInstance.class){
                if(instance==null){
                    instance=new SingletonInstance();
                }
            }
        }
        return instance;
    }
    public void fun(){
        Log.i("TAG", "SingletonInstance fun()");
    }
}
