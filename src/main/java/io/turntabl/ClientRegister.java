package io.turntabl;

import jdk.internal.ref.Cleaner;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
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
        List<String> GoldClientNames = clients.stream()
                .filter(n -> n.getServiceLevel().equals(ServiceLevel.GOLD))
                .map(n -> n.getName())
                .collect(Collectors.toList());
        return GoldClientNames;
    }




}
