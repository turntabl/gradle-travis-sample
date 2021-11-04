package io.turntabl.model;

import io.turntabl.enums.ServiceLevel;

public abstract class Client {

    private String ID;
    private ServiceLevel serviceLevel;

    public Client(String ID, ServiceLevel serviceLevel) {
        this.ID = ID;
        this.serviceLevel = serviceLevel;
    }

    public abstract String getName();

    public String getID() {
        return ID;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID='" + ID + '\'' +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}
