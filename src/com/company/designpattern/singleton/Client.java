package com.company.designpattern.singleton;
/*
  Single pattern looks simple but here we have look some important aspects.

    definition
    class has only one instance and provide global point of access to  it
    using private constructor and static we can achieve single object creation
    Some problem may while object instantion call from mutiple thread environment.
    To ensure thred safety
        Eager Intialization - creates instance of class before class loads
        Synchronized - no two threads may enter the method at the same time. synchronization is expensive and will reduce the performence
        double-checked locking - to reduce the use of synchronization in getInstance().
                                 in this first checks object created then if not allow snchronize
 */
public class Client {
    public static void main(String... args){
        //creating one instance for class without thread safety
        SingletonWithoutThreadSafety.getInstance();

        //creating one instance for class with thread safety
        SingletonWithThreadSafety.getInstance();

        SingletonWithThreadSafety.EagerIntilizationSingleton.getInstance();

        SingletonWithThreadSafety.DoubleCheckedLockSingleton.getInstance();


    }
}
