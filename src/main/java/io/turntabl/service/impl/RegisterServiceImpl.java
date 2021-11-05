package io.turntabl.service.impl;

import io.turntabl.domain.Client;
import io.turntabl.domain.ServiceLevel;
import io.turntabl.service.RegisterService;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class RegisterServiceImpl implements RegisterService {
    private final List<Client> clients;

    public RegisterServiceImpl(List<Client> clients) {
        this.clients = clients;
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
    public Optional<String> getClientNameById(String clientId) {
        return this.clients
                .stream()
                .filter(client -> client.getID().equalsIgnoreCase(clientId))
                .findFirst()
                .map(Client::getName);
    }

    @Override
    public Map<ServiceLevel, Long> countClientsPerServiceLevel() {
        System.out.println(this.clients
                .stream()
                .collect(Collectors.groupingBy(Client::getServiceLevel, Collectors.counting())));
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
}
