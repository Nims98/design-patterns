package com.nims;

public abstract class UIcontrol {
    public void enable(){
        System.out.println("enable");
    }
    public void disable(){
        System.out.println("disable");
    }
    public abstract void execute();
}
