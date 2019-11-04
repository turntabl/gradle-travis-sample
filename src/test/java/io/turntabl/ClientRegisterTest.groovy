package io.turntabl

import io.turntabl.Client
import io.turntabl.ClientRegister
import io.turntabl.ServiceLevel
import jdk.vm.ci.code.Register
import org.junit.Test

class ClientRegisterTest {

    @Test
    void testGetAllClientNames() {
        ClientRegister clientRegister = new ClientRegister(Arrays.asList(
                new Client("erbynn", 1234, ServiceLevel.PLATINUM),
                new Client("pkay", 4531, ServiceLevel.PREMIUM),
                new Client("shaddy", 7638, ServiceLevel.GOLD),
                new Client("sam", 8733, ServiceLevel.PLATINUM),
                new Client("derby", 5354, ServiceLevel.GOLD),
        ));
        assertEquals(Arrays.asList("erbynn", "john", "kwesi", "bin"), clientRegister.allClientNames);
    }


}
