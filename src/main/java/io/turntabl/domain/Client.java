package io.turntabl.domain;

public abstract class Client {
    private String ID;
    private ServiceLevel serviceLevel;

    public Client( String ID, ServiceLevel serviceLevel) {
        this.ID = ID;
        this.serviceLevel = serviceLevel;
    }
   public abstract String getName();

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public String getID() {
        return ID;
    }
}
