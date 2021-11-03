package io.turntabl.domain;

public class PrivateClient extends Client{
    private String clientName;
    public PrivateClient(String name, ServiceLevel serviceLevel, String clientName) {
        super(name, serviceLevel);
        this.clientName = clientName;
    }
}
