package io.turntabl.service;

import io.turntabl.enums.ServiceLevel;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ClientRegisterService {

    Optional<String> getClientNameById(String clientID);

    List<String> getContactNamesListOfGoldClients();

    Map<ServiceLevel, Long> countOfClientsAtEveryServiceLevel();
}
