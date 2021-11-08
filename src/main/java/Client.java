public abstract class Client {
    public String name;
    public int id;
    public Service serviceLevel;

    Client(String name, int id, Service serviceLevel){
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Service getServiceLevel() {
        return serviceLevel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}
