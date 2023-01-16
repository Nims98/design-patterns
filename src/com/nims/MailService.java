package com.nims;

public class MailService {
    // implementation details of the email service is not visible to the outside
    // only the functional requirement sendMail is visible to the outside,
    // hence creates an abstraction between implementation and usage
    public void sendMail(){
        connectServer();
        authenticate();
        System.out.println("send mail");
        disconnectServer();
    }
    private void connectServer(){
        System.out.println("Connect");
    }

    private void disconnectServer(){
        System.out.println("Disconnect");
    }
    private void authenticate(){
        System.out.println("Authenticate");
    }
}
