package dev.vivek.facade.example2;

public class Facade {
    Subsystem1 subsystem1;
    Subsystem2 subsystem2;

    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }

    public void sendNotification() {
        subsystem1.sendNotification();
        subsystem2.sendNotification();
    }
}
