package com.nims;

public class Main {
    public static void main(String[] args) {
        // loose coupling
        TaxCalculator calculator = new TaxCalculator1();
        calculator.calculateTax();

        // encapsulation
        Account account = new Account();
        account.deposit(20);
        account.withdraw(5);
        System.out.println(account.getBalance());

        // abstraction
        // only the sendMail functionality of email service is visible
        MailService mailService =new MailService();
        mailService.sendMail();


        TextBoxUIcontrol textBoxUIcontrol = new TextBoxUIcontrol();
        // inheritance
        // common functionalities of UI controls are inherited from the abstract class
        textBoxUIcontrol.enable();

        // polymorphism
        drawUIcontrol( new TextBoxUIcontrol());
        drawUIcontrol( new CheckBoxUIcontrol());
    }
    // polymorphism
    public static void drawUIcontrol(UIcontrol control){
        control.execute();
    }

}
