package io.turntabl;

public class CorporateClient extends TurntablClients{
    private String nameOfAccountManager;

    public CorporateClient(String clientsName, String clientsId, ServiceLevel serviceLevel, String nameOfAccountManager) {
        super(clientsName, clientsId, serviceLevel);
        this.nameOfAccountManager = nameOfAccountManager;
    }
}
