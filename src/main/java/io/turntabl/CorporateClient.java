package io.turntabl;

public class CorporateClient extends Client {
    private String accountManager;
    public CorporateClient(String name, String id, ServiceLevel serviceLevel, String accountManager) {
        super(name, id, serviceLevel);
        this.accountManager =accountManager;
    }

    @Override
    public String getContactName() {
        return this.accountManager;
    }

    public String getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }
}
