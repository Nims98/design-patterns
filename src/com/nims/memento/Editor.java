package com.nims.memento;
// Originator
public class Editor {
    private String content;
    private final History history = new History();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void createState(){
        EditorState newState=new EditorState(content);
        history.push(newState);
    }
    public void restoreState(){
        EditorState prevState = history.pop();
        content=prevState.getContent();
    }
}
