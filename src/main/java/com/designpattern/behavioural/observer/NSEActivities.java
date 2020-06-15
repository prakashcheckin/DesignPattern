package com.designpattern.behavioural.observer;

public interface NSEActivities {

    void register(Trader trader);
    void unregister(String name);
    void update();
}
