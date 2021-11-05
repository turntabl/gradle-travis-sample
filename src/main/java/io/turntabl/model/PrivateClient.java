package io.turntabl.model;

import io.turntabl.enums.ServiceLevel;

public class PrivateClient extends Client {

    private String name;

    public PrivateClient(String ID, String name, ServiceLevel serviceLevel) {
        super(ID, serviceLevel);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID='" + getID() + '\'' +
                ", name='" + name + '\'' +
                ", serviceLevel=" + getServiceLevel() +
                '}';
    }
}
