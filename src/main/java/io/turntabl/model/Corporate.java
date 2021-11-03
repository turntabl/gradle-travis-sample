package io.turntabl.model;

import io.turntabl.enums.ServiceLevel;

public class Corporate extends Client{


    private AccountManager accountManager;

    public Corporate(String ID, String name, ServiceLevel serviceLevel, AccountManager accountManager) {
        super(ID,name, serviceLevel);
        this.accountManager = accountManager;
    }

    public AccountManager getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public String getName() {
        return accountManager.getName();
    }
}
