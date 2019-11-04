package io.turntabl;

public class AccountManager implements ContactName{

    private String name;

    public AccountManager(String name) {
        this.name = name;
    }


    @Override
    public String getContactName() {
        return this.name;
    }
}
