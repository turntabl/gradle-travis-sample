package io.turntabl.model;

import io.turntabl.enums.ServiceLevel;
import io.turntabl.service.ClientRegisterService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClientRegister implements ClientRegisterService {

    private List<Client> clientList;

    public ClientRegister(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    @Override
    public Optional<String> getClientNameById(String clientID) {
        return clientList.stream()
                .filter(client -> client.getID().equals(clientID))
                .map(Client::getName)
                .findAny();
    }

    @Override
    public List<String> getContactNamesListOfGoldClients() {
        return clientList.stream()
                .filter(client -> client.getServiceLevel().equals(ServiceLevel.GOLD))
                .map(Client::getName)
                .collect(Collectors.toList());
    }

    @Override
    public Map<ServiceLevel, Integer> countOfClientsAtEveryServiceLevel() {
        return null;
    }

    @Override
    public String toString() {
        return "ClientRegister{" +
                "clientList=" + clientList +
                '}';
    }
}
