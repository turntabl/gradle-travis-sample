package io.turntabl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Optional;
import static org.junit.Assert.assertEquals;

public class ClientRegisterTest {


    List<Client> client = new ArrayList<>(List.of(
            new PrivateClient("John Services", 67, ServiceLevel.Gold),
            new CorporateClient("Fidelity Bank", 56, ServiceLevel.Silver),
            new CorporateClient("Morgan Stanley", 78, ServiceLevel.Gold)
    ));
    ClientRegister clientRegister = new ClientRegister(client);




    @Test
    public void testGetClients() {

    }

    @Test
    public void testGetContactGoldClients() {
        assertEquals(Arrays.asList("Client{name='John Services', id=67, serviceLevel=Gold}, Client{name='Morgan Stanley', id=67, serviceLevel=Gold}"), clientRegister.getContactGoldClients(client));


    }

    @Test
    public void testGetClientByID() {
        //assertEquals("[Client{name='Fidelity Bank', id=56, serviceLevel=Silver}]", clientRegister.getClientByID(56));
        assertEquals(Optional.empty(), clientRegister.getClientByID(1));
    }
}