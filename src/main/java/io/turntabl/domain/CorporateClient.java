package io.turntabl.domain;

public class CorporateClient extends Client{
    private final CorporateClient.AccountManager accountManager;

    public CorporateClient(String name, String ID, ServiceLevel serviceLevel) {
        super(ID + "COP", serviceLevel);
        accountManager = new AccountManager(name);
    }



    @Override
    public String getName() {
        return accountManager.getName();
    }

    @Override
    public String toString() {
        return "CorporateClient{" +
                "accountManager=" + accountManager +
                '}';
    }

    static class AccountManager {
        private final String name;

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
}
