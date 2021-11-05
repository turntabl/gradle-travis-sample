package io.turntabl.domain;

public class PrivateClient extends Client{
    private final String name;
    public PrivateClient(String name, String ID, ServiceLevel serviceLevel) {
        super(ID, serviceLevel);
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
