package io.turntabl.client;

public class PrivateClient extends Client {
    public PrivateClient(String name, ServiceLevel serviceLevel) {
        super(name, serviceLevel);
    }

    @Override
    public String toString() {
        return "Private{" +
                "name='" + getName() + '\'' +
                ", ID='" + getID() + '\'' +
                ", serviceLevel=" + getServiceLevel() +
                '}';
    }
}
