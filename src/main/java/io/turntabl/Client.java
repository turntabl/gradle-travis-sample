package io.turntabl;

public class Client {
    private String name;
    private int id;
    ServiceLevel serviceLevel;
   ClientType clientType;

    public Client(String name, int id, ServiceLevel serviceLevel, ClientType clientType) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
        this.clientType = clientType;
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
