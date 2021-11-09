package io.turntabl.service.impl;

import io.turntabl.domain.Client;
import io.turntabl.domain.ServiceLevel;
import io.turntabl.exceptions.ClientNotFoundException;
import io.turntabl.service.RegisterService;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class RegisterServiceImpl implements RegisterService {
    private  List<Client> clients;
    private final RegisterService registerService;
//
//    This is for the normal tests.
//    public RegisterServiceImpl(List<Client> clients) {
//        this.clients = clients;
//    }
//    This helps with mockito
    public RegisterServiceImpl(RegisterService registerService) {
        this.registerService = registerService;
    }

    @Override
    public List<String> getContactNames(ServiceLevel serviceLevel) {
        return this.clients
                .stream()
                .filter(client -> client.getServiceLevel() == serviceLevel)
                .map(Client::getName)
                .collect(Collectors.toList());
    }

    @Override
    public String getClientNameById(String clientId) throws ClientNotFoundException {
        return this.clients
                .stream()
                .filter(client -> client.getID().equalsIgnoreCase(clientId))
                .findFirst()
                .map(Client::getName)
                .orElseThrow(ClientNotFoundException::new);
    }

    @Override
    public Map<ServiceLevel, Long> countClientsPerServiceLevel() {


        return this.clients
                .stream()
                .collect(Collectors.groupingBy(Client::getServiceLevel, Collectors.counting()));


    }

    @Override
    public String toString() {
        return "RegisterServiceImpl{" +
                "clients=" + clients +
                '}';
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
