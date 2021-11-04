package io.turntabl.client;

public class PrivateClient extends Client {
    public PrivateClient(String name, ServiceLevel serviceLevel) {
        super(name, serviceLevel);
    }

    @Override
    public String toString() {
        return "Private{" +
                "name='" + super.getName() + '\'' +
                ", ID='" + super.getID() + '\'' +
                ", serviceLevel=" + super.getServiceLevel() +
                '}';
    }
}
