package com.weips.designpattern.Observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {

    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object o) {
        Log.e("Coder", name + " receive the msg,msg is " + o);
    }
}
