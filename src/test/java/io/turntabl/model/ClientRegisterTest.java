package io.turntabl.model;

import io.turntabl.enums.ServiceLevel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ClientRegisterTest {

    ClientRegister clientRegister;

    @BeforeEach
    void setUp() {
        List<Client> clientList = new ArrayList<>();
        clientList.add(new Private("C-1", "Judith & Daughters", ServiceLevel.GOLD));
        clientList.add(new Private("C-2", "Louis Incorporated", ServiceLevel.GOLD));
        clientList.add(new Corporate("C-3", "Mickey Incorporated", ServiceLevel.PREMIUM, new AccountManager("Micaiah Adzormani")));
        clientList.add(new Private("C-4", "James & Sons", ServiceLevel.PLATINUM));
        clientList.add(new Private("C-5", "Marvel Cinematic Universe", ServiceLevel.GOLD));
        clientList.add(new Corporate("C-6", "Facebook", ServiceLevel.PREMIUM, new AccountManager("Mark Zuckerberg")));
        clientList.add(new Private("C-7", "Amazon", ServiceLevel.PLATINUM));
        clientList.add(new Corporate("C-8", "K-Ofori & Sons", ServiceLevel.GOLD, new AccountManager("Judith Serwaa Ofosu - alias: Table-Mate")));
        clientList.add(new Private("C-9", "Alibaba", ServiceLevel.PLATINUM));
        clientList.add(new Corporate("C-10", "Turntabl", ServiceLevel.PLATINUM, new AccountManager("Sam Moore")));
        clientRegister = new ClientRegister(clientList);
    }

    @AfterEach
    void tearDown() {
        clientRegister = null;
    }

    @Test
    void checkReturnListOfClients() {
        List<Client> clientList = clientRegister.getClientList();
        boolean clientListIsEmpty = clientList.isEmpty();
        assertFalse(clientListIsEmpty);
    }

    @Test
    void checkGetContactNamesOfGoldClients() {
        List<String> contactNamesListOfGoldClients = clientRegister.getContactNamesListOfGoldClients();

        List<String> expectedNamesList = new ArrayList<>();
        expectedNamesList.add("Judith & Daughters");
        expectedNamesList.add("Louis Incorporated");
        expectedNamesList.add("Marvel Cinematic Universe");
        expectedNamesList.add("Judith Serwaa Ofosu - alias: Table-Mate");
        assertLinesMatch(expectedNamesList, contactNamesListOfGoldClients);
        System.out.println(contactNamesListOfGoldClients);
    }

    @Test
    void checkGetClientNameById() {
        Optional<String> optionalClientName = clientRegister.getClientNameById("C-1");
        assertNotNull(optionalClientName.get());
    }

    @Test
    void checkCountOfClientsAtEveryServiceLevel() {
        Map<ServiceLevel, Long> serviceLevelCountMap = clientRegister.countOfClientsAtEveryServiceLevel();
        long countOfGoldClients = serviceLevelCountMap.get(ServiceLevel.GOLD);
        long countOfPlatinumClients = serviceLevelCountMap.get(ServiceLevel.PLATINUM);
        long countOfPremiumClients = serviceLevelCountMap.get(ServiceLevel.PREMIUM);

        assertFalse(serviceLevelCountMap.isEmpty());
        assertNotNull(countOfGoldClients, "GOLD ServiceLevel has a total of :" + countOfGoldClients + ": clients");
        assertNotNull(countOfPlatinumClients, "PLATINUM ServiceLevel has a total of :" + countOfPlatinumClients + ": clients");
        assertNotNull(countOfPremiumClients, "PREMIUM ServiceLevel has a total of :" + countOfPremiumClients + ": clients");

        System.out.println(serviceLevelCountMap);
    }
}