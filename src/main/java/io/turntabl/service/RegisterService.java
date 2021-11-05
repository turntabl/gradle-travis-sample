package io.turntabl.service;

import io.turntabl.domain.ServiceLevel;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface RegisterService {
    List<String> getContactNames(ServiceLevel serviceLevel);
    Optional<String> getClientNameById(String clientId);
    Map<ServiceLevel, Integer> countClients();
}
