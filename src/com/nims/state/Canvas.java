package com.nims.state;

public class Canvas {
    private SelectedTool currentTool;

    public void setCurrentTool(SelectedTool currentTool) {
        this.currentTool = currentTool;
    }
public void mouseUp(){
        currentTool.mouseUpAction();
}
public void mouseDown(){
        currentTool.mouseDownAction();
}
}
