package com.nims.observer;

public class Chart implements Observer{
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update(/*int value*/) {
        System.out.println("chart updated : "+dataSource.getValue());
    }
}
