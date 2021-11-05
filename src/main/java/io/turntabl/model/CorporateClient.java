package io.turntabl.model;

import io.turntabl.enums.ServiceLevel;

public class CorporateClient extends Client{

    private String name;
    private AccountManager accountManager;

    public CorporateClient(String ID, String name, ServiceLevel serviceLevel, AccountManager accountManager) {
        super(ID, serviceLevel);
        this.name = name;
        this.accountManager = accountManager;
    }

    @Override
    public String getName() {
        return accountManager.getName();
    }

    @Override
    public String toString() {
        return "Corporate{" +
                "ID='" + getID() + '\'' +
                ", name='" + name + '\'' +
                ", serviceLevel=" + getServiceLevel() +
                "accountManager=" + accountManager +
                '}';
    }
}
