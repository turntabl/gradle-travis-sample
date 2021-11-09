package io.turntabl.service;

import io.turntabl.domain.ServiceLevel;
import io.turntabl.exceptions.ClientNotFoundException;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface RegisterService {
    List<String> getContactNames(ServiceLevel serviceLevel);
    String getClientNameById(String clientId) throws ClientNotFoundException;
    Map<ServiceLevel, Long> countClientsPerServiceLevel();
}
