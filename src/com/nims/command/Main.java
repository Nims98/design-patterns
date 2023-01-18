package com.nims.command;

import com.nims.command.fx.Button;

public class Main {
    public static void main(String[] args) {
        var customerService = new CustomerService();
        var addCustomerCommand = new AddCustomerCommand(customerService);
        var button = new Button(addCustomerCommand);
        button.onClick();
    }
}
