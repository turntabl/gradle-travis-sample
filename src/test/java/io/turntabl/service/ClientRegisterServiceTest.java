package io.turntabl.service;

import io.turntabl.enums.ServiceLevel;
import io.turntabl.model.*;
import io.turntabl.serviceImpl.ClientRegisterServiceImplementation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ClientRegisterServiceTest {

    @Mock
    ClientRegister clientRegister;

    @InjectMocks
    ClientRegisterServiceImplementation clientRegisterServiceImplementation;

    @BeforeEach
    void setUp() {
        List<Client> clientList = new ArrayList<>();
        clientList.add(new PrivateClient("C-1", "Judith & Daughters", ServiceLevel.GOLD));
        clientList.add(new PrivateClient("C-2", "Louis Incorporated", ServiceLevel.GOLD));
        clientList.add(new CorporateClient("C-3", "Mickey Incorporated", ServiceLevel.PREMIUM, new AccountManager("Micaiah Adzormani")));
        clientList.add(new PrivateClient("C-4", "James & Sons", ServiceLevel.PLATINUM));
        clientList.add(new PrivateClient("C-5", "Marvel Cinematic Universe", ServiceLevel.GOLD));
        clientList.add(new CorporateClient("C-6", "Facebook", ServiceLevel.PREMIUM, new AccountManager("Mark Zuckerberg")));
        clientList.add(new PrivateClient("C-7", "Amazon", ServiceLevel.PLATINUM));
        clientList.add(new CorporateClient("C-8", "K-Ofori & Sons", ServiceLevel.GOLD, new AccountManager("Judith Serwaa Ofosu")));
        clientList.add(new PrivateClient("C-9", "Alibaba", ServiceLevel.PLATINUM));
        clientList.add(new CorporateClient("C-10", "Turntabl", ServiceLevel.PLATINUM, new AccountManager("Sam Moore")));
        clientRegister = new ClientRegister(clientList);
        clientRegisterServiceImplementation = new ClientRegisterServiceImplementation(clientRegister);
    }

    @AfterEach
    void tearDown() {
        clientRegisterServiceImplementation = null;
    }

    @Test
    void checkReturnListOfClients() {
        List<Client> clientList = clientRegisterServiceImplementation.getClientList();
        boolean clientListIsEmpty = clientList.isEmpty();
        assertFalse(clientListIsEmpty);
        System.out.println(clientList);
    }

    @Test
    void checkGetContactNamesOfGoldClients() {
        List<String> contactNamesListOfGoldClients = clientRegisterServiceImplementation.getContactNamesListOfGoldClients();

        List<String> expectedNamesList = new ArrayList<>();
        expectedNamesList.add("Judith & Daughters");
        expectedNamesList.add("Louis Incorporated");
        expectedNamesList.add("Marvel Cinematic Universe");
        expectedNamesList.add("Judith Serwaa Ofosu");
        assertLinesMatch(expectedNamesList, contactNamesListOfGoldClients);
        System.out.println(contactNamesListOfGoldClients);
    }

    @Test
    void checkGetClientNameById() {
        Optional<String> optionalClientName = clientRegisterServiceImplementation.getClientNameById("C-8");
        assertEquals("Judith Serwaa Ofosu", optionalClientName.get());
        System.out.println(optionalClientName.get());
    }

    @Test
    void checkCountOfClientsAtEveryServiceLevel() {
        Map<ServiceLevel, Long> serviceLevelCountMap = clientRegisterServiceImplementation.countOfClientsAtEveryServiceLevel();
        long countOfGoldClients = serviceLevelCountMap.get(ServiceLevel.GOLD);
        long countOfPlatinumClients = serviceLevelCountMap.get(ServiceLevel.PLATINUM);
        long countOfPremiumClients = serviceLevelCountMap.get(ServiceLevel.PREMIUM);

        assertEquals(4, countOfGoldClients, "GOLD ServiceLevel has a total of" + countOfGoldClients + ": clients");
        assertEquals(4, countOfPlatinumClients, "PLATINUM ServiceLevel has a total of :" + countOfPlatinumClients + ": clients");
        assertEquals(2, countOfPremiumClients, "PREMIUM ServiceLevel has a total of :" + countOfPremiumClients + ": clients");
        System.out.println(serviceLevelCountMap);
    }
}