package io.turntabl.serviceImpl;

import io.turntabl.enums.ServiceLevel;
import io.turntabl.model.Client;
import io.turntabl.model.ClientRegister;
import io.turntabl.service.ClientRegisterService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClientRegisterServiceImplementation implements ClientRegisterService {

    private ClientRegister clientRegister;

    public ClientRegisterServiceImplementation(ClientRegister clientRegister) {
        this.clientRegister = clientRegister;
    }

    @Override
    public List<Client> getClientList() {
        return clientRegister.getClientList();
    }

    @Override
    public Optional<String> getClientNameById(String clientID) {
        return getClientList().stream()
                .filter(client -> client.getID().equals(clientID))
                .map(Client::getName)
                .findAny();
    }

    @Override
    public List<String> getContactNamesListOfGoldClients() {
        return getClientList().stream()
                .filter(client -> client.getServiceLevel().equals(ServiceLevel.GOLD))
                .map(Client::getName)
                .collect(Collectors.toList());
    }

    @Override
    public Map<ServiceLevel, Long> countOfClientsAtEveryServiceLevel() {
        Map<ServiceLevel, Long> serviceLevelIntegerMap = new HashMap<>();
        serviceLevelIntegerMap.put(ServiceLevel.GOLD, getClientList().stream().filter(client -> client.getServiceLevel().equals(ServiceLevel.GOLD)).count());
        serviceLevelIntegerMap.put(ServiceLevel.PLATINUM, getClientList().stream().filter(client -> client.getServiceLevel().equals(ServiceLevel.PLATINUM)).count());
        serviceLevelIntegerMap.put(ServiceLevel.PREMIUM, getClientList().stream().filter(client -> client.getServiceLevel().equals(ServiceLevel.PREMIUM)).count());
        return serviceLevelIntegerMap;
    }
}
