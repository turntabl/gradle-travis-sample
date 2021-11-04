import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ClientRegisterTest {
    ClientRegister reg1 = new ClientRegister(
            new CorporateClient("Morgan Stanley", 1001, Service.PLATINUM),
            new CorporateClient("Fidelity", 1002, Service.GOLD),
            new CorporateClient("Cal Bank", 1003, Service.GOLD)
    );

    @Test
    void getGoldClientsNamesTest(){
        List<String> names = new ArrayList<>();
    }
}
