package io.turntabl;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientRegisterTest {

    @Test
    void getAllClientNames() {
        ClientRegister clientRegister = new ClientRegister(Arrays.asList(
                new Client("erbynn", 1234, ServiceLevel.PLATINUM, ClientType.CORPORATE),
                new Client("john", 1234, ServiceLevel.GOLD, ClientType.PRIVATE),
                new Client("sam", 1234, ServiceLevel.PLATINUM, ClientType.CORPORATE),
                new Client("yaa", 1234, ServiceLevel.GOLD, ClientType.PRIVATE),
                new Client("debby", 1234, ServiceLevel.PLATINUM, ClientType.CORPORATE),

        ));

        List<String> contactNames = clientRegister.str
    }
}


