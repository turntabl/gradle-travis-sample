package io.turntabl;

public class CorporateClient extends Client{

    public CorporateClient(String name, int id, ServiceLevel serviceLevel) {
        super(name, id, serviceLevel);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public ServiceLevel getServiceLevel() {
        return super.getServiceLevel();
    }
}
