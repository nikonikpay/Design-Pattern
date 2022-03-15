package com.ali.command;

public class SimpleRemoteControll {
    Command slot;

    public SimpleRemoteControll() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }

}
