package io.turntabl.model;

public class AccountManager {

    private String name;

    public AccountManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AccountManager{" +
                "name='" + name + '\'' +
                '}';
    }
}
