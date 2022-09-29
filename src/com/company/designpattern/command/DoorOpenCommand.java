package com.company.designpattern.command;

public class DoorOpenCommand implements Command{
    Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.Open();
    }

    @Override
    public void undo() {
        door.Close();
    }
}
