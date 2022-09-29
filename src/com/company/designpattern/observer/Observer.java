package com.company.designpattern.observer;
/*
All our weather components
implement the Observer
interface. This gives the
Subject a common interface
to talk to when it comes time
to update the observers
 */
public interface Observer {
    void update(float temp,float humidity,float moisture);
}
