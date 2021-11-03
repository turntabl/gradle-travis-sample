package io.turntabl;

public class AccountManager extends CorporateClient{
    private String name;
    private int id;
    private ServiceLevel serviceLevel;

    public AccountManager(String name,int id,ServiceLevel serviceLevel) {
        super(name,  id,  serviceLevel);
    }


}
