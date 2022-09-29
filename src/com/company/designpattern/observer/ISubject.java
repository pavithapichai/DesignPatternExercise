package com.company.designpattern.observer;
/*
The ISubject class keeps
track of all your observers
and notifies them for you.
 */
public interface ISubject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
