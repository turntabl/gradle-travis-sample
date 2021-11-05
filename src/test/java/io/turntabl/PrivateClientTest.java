package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PrivateClientTest {

    @Test
    public void checkingForName(){
        PrivateClient privateClient = new PrivateClient("Mandela", "gfsdf", ServiceLevel.PREMIUM);
        String namePrivate = privateClient.getContactName();
        assertEquals("Mandela", namePrivate);

    }

}
