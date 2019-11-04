package io.turntabl;

public class CorporateClient extends Client{

    private AccountManager accountManager;

    public CorporateClient(String name, int id, ServiceLevel serviceLevel) {
        super(name, id, serviceLevel);
    }
}
