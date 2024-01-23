package com.steffenboe.udemy.oop.oop;

public interface Notification {

    void handle();
    
    boolean hasSameType(Notification other);

}
