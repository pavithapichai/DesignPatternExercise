package com.company.designpattern.singleton;

public class SingletonWithThreadSafety {
    private SingletonWithThreadSafety(){

    }
    public static synchronized SingletonWithThreadSafety getInstance(){
        return new SingletonWithThreadSafety();
    }

     static class DoubleCheckedLockSingleton{
        private  static  DoubleCheckedLockSingleton instance;
        private DoubleCheckedLockSingleton() {

        }
        public static DoubleCheckedLockSingleton getInstance(){
            if(instance == null){
                synchronized (DoubleCheckedLockSingleton.class){
                    if(instance == null)
                        return new DoubleCheckedLockSingleton();
                }
            }
            return instance;
        }
    }

    static class EagerIntilizationSingleton{
        private static EagerIntilizationSingleton  instance = new EagerIntilizationSingleton();
        private EagerIntilizationSingleton() {
        }
        public static  EagerIntilizationSingleton getInstance(){
            return instance;
        }
    }
}



