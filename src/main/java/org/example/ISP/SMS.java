package org.example.ISP;

public class SMS implements Notification, Retryable{
    @Override
    public void send() {
        System.out.println("Sending sms");
    }

    @Override
    public void retry() {
        System.out.println("retrying sms");
    }
}
