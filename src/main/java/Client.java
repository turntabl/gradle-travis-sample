public abstract class Client {
    private String name;
    private int id;
    private Service service;

    public Client(String name, int id, Service service){
        this.name = name;
        this.id = id;
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Service getService() {
        return service;
    }
}


