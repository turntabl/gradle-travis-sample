package io.turntabl.service;

import io.turntabl.enums.ServiceLevel;
import io.turntabl.model.Client;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ClientRegisterService {

    List<Client> getClientList();

    Optional<String> getClientNameById(String clientID);

    List<String> getContactNamesListOfGoldClients();

    Map<ServiceLevel, Long> countOfClientsAtEveryServiceLevel();
}
