package io.turntabl;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorporateTest {
CorporateClient corporateClient;
    @Test
    public void checkingCorporate(){
        CorporateClient corporateClient = new CorporateClient("Amazona Limited", "gdgv", ServiceLevel.GOLD, "Travis Here");
        String name = corporateClient.getContactName();
        assertEquals("Travis Here", name);

    }
}
