package com.nims.state;

public class PenTool implements SelectedTool{
    @Override
    public void mouseUpAction() {
        System.out.println("draw with pen");
    }

    @Override
    public void mouseDownAction() {
        System.out.println("pen tool");
    }
}
