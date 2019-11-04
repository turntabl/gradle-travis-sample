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

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }
}
