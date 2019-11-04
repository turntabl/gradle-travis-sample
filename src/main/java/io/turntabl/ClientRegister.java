package io.turntabl;

import jdk.internal.ref.Cleaner;

import java.util.List;
import java.util.Set;

public class ClientRegister {

    private List<Client> clients;

    public ClientRegister(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getAllClientNames(){
        return clients;
    }
}
