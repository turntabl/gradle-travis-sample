package io.turntabl;


import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClientRegisterTest {

    List <PrivateClient> privateClientList= List.of(new PrivateClient("HAVA", "FGXDFF",ServiceLevel.GOLD),
            new PrivateClient("Frank","fff", ServiceLevel.PREMIUM),
            new PrivateClient("Mary", "uuu", ServiceLevel.PLATINUM),
            new PrivateClient("Tanya", "ggg", ServiceLevel.GOLD),
            new PrivateClient("Keith", "kkk", ServiceLevel.GOLD),
            new PrivateClient("K", "kkk", ServiceLevel.GOLD),
            new PrivateClient("Java", "qqq", ServiceLevel.PREMIUM));

    List<CorporateClient> corporateClientList = List.of(new CorporateClient("Query", "ttt", ServiceLevel.GOLD, "Selah"),
            new CorporateClient("Dana Limited","vvv", ServiceLevel.GOLD, "Martin"),
            new CorporateClient("Lina Limited", "www", ServiceLevel.PREMIUM, "Nelson"),
            new CorporateClient("Ana Limited", "xxx", ServiceLevel.PLATINUM, "Passion"),
            new CorporateClient("Kemmy Enterprise", "xxx", ServiceLevel.PLATINUM, "Kemmy"),
            new CorporateClient("Ana Limited", "xxx", ServiceLevel.PLATINUM, "Passion"),
            new CorporateClient("Wema Limited", "xyy", ServiceLevel.PLATINUM, "Sifa"),
            new CorporateClient("Tima Limited", "xyz", ServiceLevel.PLATINUM, "Pendo"));

    ClientRegister clientRegister = new ClientRegister(privateClientList, corporateClientList);

    @Test
    public void checkForListOfPrivateClient(){
         int clientName = clientRegister.getPrivateClientList().size();
        assertEquals(7, clientName);

    }


}
