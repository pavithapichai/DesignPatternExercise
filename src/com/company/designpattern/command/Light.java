package com.company.designpattern.command;

public class Light {
    String type;
    public Light(String loction) {
        this.type = loction;
    }

    public void On(){
        System.out.println(type+" Light On");
    }

    public void Off(){
        System.out.println(type+" Light Off");
    }
}
