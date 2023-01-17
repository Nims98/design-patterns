package com.nims.state;

public class BrushTool implements SelectedTool{
    @Override
    public void mouseUpAction() {
        System.out.println("draw with brush");
    }

    @Override
    public void mouseDownAction() {
        System.out.println("brush tool");
    }
}
