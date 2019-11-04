package io.turntabl;

public class Client {
    private String name;
    private int id;
    ServiceLevel serviceLevel;

    public Client(String name, int id, ServiceLevel serviceLevel) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
    }


}
