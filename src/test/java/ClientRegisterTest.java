import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClientRegisterTest {
    ClientRegister reg1 = new ClientRegister(
            new CorporateClient("Morgan Stanley", 1001, Service.PLATINUM),
            new CorporateClient("Fidelity", 1002, Service.GOLD),
            new CorporateClient("Cal Bank", 1003, Service.GOLD)
    );

    @Test
    public void getClientsNamesBasedOnServiceTest(){
        List<String> expected = Arrays.asList("Fidelity", "Cal Bank");
        List<String> actual = reg1.getClientsNamesBasedOnService(Service.GOLD);
        assertEquals(expected, actual);
    }

    @Test
    public void getClientNameByIdTest(){
        String expected = "Fidelity";
        String actual = reg1.getClientNameById(1002);
        assertEquals(expected, actual);
    }

    @Test
    public void getClientCountBasedOnService(){
        String expected = "Gold clients: 2, Premium clients: 0, Platinum clients: 1";
        String actual = reg1.getClientCountBasedOnService();
        assertEquals(expected, actual);
    }
}
