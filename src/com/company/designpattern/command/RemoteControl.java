package com.company.designpattern.command;

public class RemoteControl {
    Command[] OnCommands;
    Command[] OffCommands;
    Command unDo;

    public RemoteControl() {
        OnCommands = new Command[7];
        OffCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i =0;i<3;i++){
            OffCommands[i]=noCommand;
            OnCommands[i] = noCommand;
        }
        unDo = noCommand;

    }
    public void setCommand(int slot,Command Oncommand,Command offCommand){
        OnCommands[slot] = Oncommand;
        OffCommands[slot] = offCommand;
    }
    public void OnButtonPressed(int slot){
        OnCommands[slot].execute();
        unDo = OnCommands[slot];
    }
    public void OffButtonPressed(int slot){
        OffCommands[slot].execute();
        unDo = OffCommands[slot];
    }
    public void UndoButtonPressed(){
        unDo.undo();
    }
}
