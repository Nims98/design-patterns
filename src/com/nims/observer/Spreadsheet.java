package com.nims.observer;

public class Spreadsheet implements Observer{
    private DataSource dataSource;

    public Spreadsheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update(/*int value*/) {
        System.out.println("spreadsheet updated : "+dataSource.getValue());
    }
}
