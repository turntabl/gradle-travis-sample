package io.turntabl;

import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClientRegister {
    private ArrayList<Client> clients;
    
//    public ClientRegister(Client... clients) {
//        this.clients = Arrays.asList(clients);
//    }

    public ClientRegister(ArrayList<Client> clients) {
        this.clients = clients;
    }



    public List<Client> getClients() {
        return clients;
    }

    public List<Client> getContactGoldClients (List<Client> clients) {
        List<Client> goldClients = clients.stream().filter(client -> client.getServiceLevel() == ServiceLevel.Gold).collect(Collectors.toList());
        return goldClients;
    }
}
