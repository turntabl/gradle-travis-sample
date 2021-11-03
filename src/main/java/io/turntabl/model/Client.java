package io.turntabl.model;

import io.turntabl.enums.ServiceLevel;

public abstract class Client {

    private String ID;
    private String name;
    private ServiceLevel serviceLevel;

    public Client(String ID, String name, ServiceLevel serviceLevel) {
        this.ID = ID;
        this.name = name;
        this.serviceLevel = serviceLevel;
    }

    public abstract String getName();

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
}
