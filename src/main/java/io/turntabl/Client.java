package io.turntabl;

public class Client {
    private String name;
    private int id;
    private ServiceLevel serviceLevel;

    public Client(String name, int id, ServiceLevel serviceLevel) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
    }

    public  String getName() {
        return this.name;
    };

    public int getId() {
        return id;
    }
    public ServiceLevel getServiceLevel() {return serviceLevel;}

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", serviceLevel=" + serviceLevel.toString() +
                '}';
    }
}
