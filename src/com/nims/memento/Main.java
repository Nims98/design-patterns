package com.nims.memento;

public class Main {
    public static void main(String args[]){

        Editor editor = new Editor();
            editor.setContent("a");
            editor.createState();

            editor.setContent("b");
            editor.createState();

            editor.setContent("c");
            editor.restoreState();
            editor.restoreState();
            System.out.println(editor.getContent());
    }
}
