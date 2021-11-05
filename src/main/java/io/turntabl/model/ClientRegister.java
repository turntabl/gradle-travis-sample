package io.turntabl.model;

import java.util.List;

public class ClientRegister {

    private List<Client> clientList;

    public ClientRegister(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    @Override
    public String toString() {
        return "ClientRegister{" +
                "clientList=" + clientList +
                '}';
    }
}
