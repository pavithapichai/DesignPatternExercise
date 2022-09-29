package com.company.designpattern.command;


public class DoorCloseCommand implements Command{
    Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.Close();
    }

    @Override
    public void undo() {
        door.Open();
    }
}
