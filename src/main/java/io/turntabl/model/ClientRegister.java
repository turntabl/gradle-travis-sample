package io.turntabl.model;

import io.turntabl.enums.ServiceLevel;
import io.turntabl.service.ClientRegisterService;

import java.util.*;
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
    public List<String> getContactNamesListOfGoldClients() {
        return clientList.stream()
                .filter(client -> client.getServiceLevel().equals(ServiceLevel.GOLD))
                .map(Client::getName)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<String> getClientNameById(String clientID) {
        return clientList.stream()
                .filter(client -> client.getID().equals(clientID))
                .map(Client::getName)
                .findAny();
    }

    @Override
    public Map<ServiceLevel, Long> countOfClientsAtEveryServiceLevel() {
        Map<ServiceLevel, Long> serviceLevelIntegerMap = new HashMap<>();
        serviceLevelIntegerMap.put(ServiceLevel.GOLD, clientList.stream().filter(client -> client.getServiceLevel().equals(ServiceLevel.GOLD)).count());
        serviceLevelIntegerMap.put(ServiceLevel.PLATINUM, clientList.stream().filter(client -> client.getServiceLevel().equals(ServiceLevel.PLATINUM)).count());
        serviceLevelIntegerMap.put(ServiceLevel.PREMIUM, clientList.stream().filter(client -> client.getServiceLevel().equals(ServiceLevel.PREMIUM)).count());
        return serviceLevelIntegerMap;
    }

    @Override
    public String toString() {
        return "ClientRegister{" +
                "clientList=" + clientList +
                '}';
    }
}
