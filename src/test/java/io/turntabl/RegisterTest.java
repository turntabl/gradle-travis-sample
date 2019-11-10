package io.turntabl;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class RegisterTest {
    @Test
    public void testForAllClients() {
        CorporateClient corporateClient1 = new CorporateClient("Isaac", "TT1234", ServiceLevel.Gold, "Agyen");
        CorporateClient corporateClient2 = new CorporateClient("Yaw", "TT1235", ServiceLevel.Platinum, "Duffour");
        CorporateClient corporateClient3 = new CorporateClient("Ann", "TT1236", ServiceLevel.Gold, "kofi");

        PrivateClients privateClients1 = new PrivateClients("Williams", "TT741", ServiceLevel.Premium);
        PrivateClients privateClients2 = new PrivateClients("Williams", "TT741", ServiceLevel.Platinum);

        Register register = new Register(Arrays.asList(corporateClient1, corporateClient2, corporateClient3, privateClients1, privateClients2));

        assertEquals(Arrays.asList(corporateClient1, corporateClient2, corporateClient3, privateClients1, privateClients2), register.getTurntablClients());
    }

    @Test
    public void testGetGoldList_Empty() {
        CorporateClient corporateClient2 = new CorporateClient("Yaw", "TT1235", ServiceLevel.Platinum, "Duffour");
        CorporateClient corporateClient3 = new CorporateClient("Ann", "TT1236", ServiceLevel.Premium, "kofi");

        PrivateClients privateClients1 = new PrivateClients("Williams", "TT741", ServiceLevel.Premium);
        Register register = new Register(Arrays.asList(corporateClient2, corporateClient3, privateClients1));
        assertEquals(Arrays.asList(), register.getListOfGoldClient());
    }

    @Test
    public void testGetGoldList_notEmpty() {
        CorporateClient corporateClient2 = new CorporateClient("Yaw", "TT1235", ServiceLevel.Gold, "Duffour");
        CorporateClient corporateClient3 = new CorporateClient("Ann", "TT1236", ServiceLevel.Premium, "kofi");

        PrivateClients privateClients1 = new PrivateClients("Williams", "TT741", ServiceLevel.Gold);
        Register register = new Register(Arrays.asList(corporateClient2, corporateClient3, privateClients1));
        assertEquals(Arrays.asList("Yaw", "Williams"), register.getListOfGoldClient());
    }

    @Test
    public void testGetClientById_Available(){
        CorporateClient corporateClient2 = new CorporateClient("Yaw", "TT1235", ServiceLevel.Gold, "Duffour");
        //CorporateClient corporateClient3 = new CorporateClient("Ann", "TT1236", ServiceLevel.Premium, "kofi");
        Register register = new Register(Arrays.asList(corporateClient2));
        assertTrue(register.getClientById("TT1235").isPresent());
        }
    @Test
    public void testGetClientById_NotAvailable() {
        CorporateClient corporateClient2 = new CorporateClient("Yaw", "TT1235", ServiceLevel.Gold, "Duffour");
        //CorporateClient corporateClient3 = new CorporateClient("Ann", "TT1236", ServiceLevel.Premium, "kofi");
        Register register = new Register(Arrays.asList(corporateClient2));
        assertFalse(register.getClientById("TT1239").isPresent());
    }
    @Test
    public void testForNumberOfClientsAtEachLevel(){
        CorporateClient corporateClient1 = new CorporateClient("Isaac", "TT1234", ServiceLevel.Gold, "Agyen");
        CorporateClient corporateClient2 = new CorporateClient("Yaw", "TT1235", ServiceLevel.Platinum, "Duffour");
        CorporateClient corporateClient3 = new CorporateClient("Ann", "TT1236", ServiceLevel.Gold, "kofi");

        PrivateClients privateClients1 = new PrivateClients("Williams", "TT741", ServiceLevel.Premium);
        PrivateClients privateClients2 = new PrivateClients("Williams", "TT741", ServiceLevel.Platinum);

        Register register = new Register(Arrays.asList(corporateClient1, corporateClient2, corporateClient3, privateClients1, privateClients2));

        Map<ServiceLevel, Integer> total = new HashMap<>();
        total.put(ServiceLevel.Platinum, 2);
        total.put(ServiceLevel.Gold, 2);
        total.put(ServiceLevel.Premium, 1);

        assertEquals(total, register.numberOfClientsAtEveryLevel());

    }
}

