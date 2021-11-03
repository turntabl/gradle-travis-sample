package io.turntabl.domain;

public class CorporateClient extends Client{
    private AccountManager accountManager;
    public CorporateClient(String corporateName, ServiceLevel serviceLevel, AccountManager accountManager) {
        super(corporateName, serviceLevel);
        this.accountManager = accountManager;

    }
}
