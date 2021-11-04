package io.turntabl.client;

public class CorporateClient extends Client {
    private final AccountManager accountManager;

    public CorporateClient(AccountManager accountManager, ServiceLevel serviceLevel) {
        super(serviceLevel);
        this.accountManager = accountManager;
    }

    @Override
    public String getName() {
        return accountManager.getName();
    }

    @Override
    public void setName(String name) {
       accountManager.setName(name);
    }

    @Override
    public String toString() {
        return "Corporate{" +
                "name='" + getName() + '\'' +
                ", ID='" + getID() + '\'' +
                ", serviceLevel=" + getServiceLevel() +
                '}';
    }
}
