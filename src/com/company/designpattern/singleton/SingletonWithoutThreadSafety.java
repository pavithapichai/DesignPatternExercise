package com.company.designpattern.singleton;

public class SingletonWithoutThreadSafety {
    private  static SingletonWithoutThreadSafety instance;
    private SingletonWithoutThreadSafety(){

    }
    public static SingletonWithoutThreadSafety getInstance(){
        //lazy initialization
        if(instance ==null)
            return  new SingletonWithoutThreadSafety();
        return  instance;
    }


}
