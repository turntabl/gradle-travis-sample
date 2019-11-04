package io.turntabl;

import jdk.internal.ref.Cleaner;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ClientRegister {

    private List<Client> clients;

    public ClientRegister(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getAllClientNames(){
        return clients;
    }

    public List<String> goldClients(){
        List<String> contactNames = clients.stream().map(c -> c.serviceLevel.equals(ServiceLevel.PLATINUM)).collect(Collectors.toList());
        List<String> cn = clients.stream().map(n -> n.getName())
                .filter().collect(Collectors.toList());
        return cn;
    }
}
