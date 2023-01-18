package com.nims.command.fx;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void onClick(){
        command.execute();
    }
}
