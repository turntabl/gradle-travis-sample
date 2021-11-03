package io.turntabl.domain;

public class Client {
    private String name;
    private int ID = 0;
    ServiceLevel serviceLevel;

    public Client(String name, ServiceLevel serviceLevel) {
        this.ID++;
        this.name = name;
        this.serviceLevel = serviceLevel;
    }
}
