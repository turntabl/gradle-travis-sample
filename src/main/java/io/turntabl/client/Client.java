package io.turntabl.client;

import java.util.UUID;

public class Client {
    private final String ID = UUID.randomUUID().toString();
    private ServiceLevel serviceLevel;

    public Client(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getID() {
        return ID;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID='" + ID + '\'' +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}
