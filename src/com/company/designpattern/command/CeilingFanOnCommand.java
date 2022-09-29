package com.company.designpattern.command;

public class CeilingFanOnCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
      //  ceilingFan.On();
    }

    @Override
    public void undo() {
        ceilingFan.Off();
    }
}
