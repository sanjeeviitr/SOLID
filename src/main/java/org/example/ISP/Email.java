package org.example.ISP;

public class Email implements Notification, Scheduler{
    @Override
    public void send() {
        System.out.println("Sending email");
    }

    @Override
    public void schedule() {
        System.out.println("Scheduling email");
    }
}
