package io.turntabl;

public class CorporateClient extends Client implements ContactName{

    private AccountManager accountManager;

    public CorporateClient(String name, int id, ServiceLevel serviceLevel) {
        super(name, id, serviceLevel);
    }

    @Override
    public void getContactName() {

    }
}
