package com.nims.state;

public class EraserTool implements SelectedTool{
    @Override
    public void mouseUpAction() {
        System.out.println("erase content");
    }

    @Override
    public void mouseDownAction() {
        System.out.println("eraser tool");
    }
}
