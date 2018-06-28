package com.weips.designpattern.Observer;

import java.util.Observable;

public class Manager extends Observable {

    public void declareMessage(String msg) {
        setChanged();
        notifyObservers(msg);
    }
}
