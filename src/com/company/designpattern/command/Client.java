package com.company.designpattern.command;
/*
    Encapsulates request as an object,
    thereby letting you parameterize other objects
with different requests, queue or log requests, and support
undoable operations

    Decoupled invoker from receiver (vendor class eg:Light,CeilingFan)
    Invoker do only know what is request and then it just invoke the execute method
    receiver knows how to serve request (implementation)
 */
public class Client {
    public static void main(String... arg){
        RemoteControl remoteControl = new RemoteControl(); // Invoker
        Light light = new Light("Kitchen");//receiver
        Light lightLiving = new Light("Kitchen");
        //Light command
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        remoteControl.OnButtonPressed(0);
        remoteControl.OffButtonPressed(0);
        remoteControl.UndoButtonPressed();


        //Ceiling fan request and undo operation
        CeilingFan ceilingFan = new CeilingFan("Living Room");//receiver
        CeilingFanMediumCommand ceilingFanMedium =
                new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh =
                new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.OnButtonPressed(0);
        remoteControl.OffButtonPressed(0);
        System.out.println(remoteControl);
        remoteControl.UndoButtonPressed();

        remoteControl.OnButtonPressed(1);
        System.out.println(remoteControl);
        remoteControl.UndoButtonPressed();

    }
}
