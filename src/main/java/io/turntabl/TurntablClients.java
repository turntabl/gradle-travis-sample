package io.turntabl;

public class TurntablClients {
    private String clientsName;
    private String clientsId;
    private ServiceLevel serviceLevel;

    public TurntablClients(String clientsName, String clientsId, ServiceLevel serviceLevel) {
        this.clientsName = clientsName;
        this.clientsId = clientsId;
        this.serviceLevel = serviceLevel;
    }

    public String getClientsName() {
        return clientsName;
    }

    public void setClientsName(String clientsName) {
        this.clientsName = clientsName;
    }

    public String getClientsId() {
        return clientsId;
    }

    public void setClientsId(String clientsId) {
        this.clientsId = clientsId;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
}
