package io.turntabl.client;

public class Corporate extends Client implements AccountManager {
    private String name;

    public Corporate(String name, ServiceLevel serviceLevel) {
        super(serviceLevel);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
