package io.turntabl.service.impl;

import io.turntabl.domain.Client;
import io.turntabl.domain.ServiceLevel;
import io.turntabl.service.RegisterService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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
                .toList();
    }

    @Override
    public Optional<String> getClientNameById(String clientId) {
        return Optional.empty();
    }

    @Override
    public Map<ServiceLevel, Integer> countClients() {
        return null;
    }
}
