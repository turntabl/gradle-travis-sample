package io.turntabl;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountManagerTest {

    @Test
    public void getContactName() {
        AccountManager am = new AccountManager("jee");
        assertEquals("jee", am.getContactName());
    }
}