package io.turntabl;

public class CorporateClient extends Client{
    AccountManager accountManager;

    public CorporateClient(String name, int id, ServiceLevel serviceLevel) {
        super(name, id, serviceLevel);
    }

    @Override
    public String getName() {
        return accountManager.getName();
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
