package io.turntabl.client;

public class Private extends Client {
    private String name;

    public Private(String name, ServiceLevel serviceLevel) {
        super(serviceLevel);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
