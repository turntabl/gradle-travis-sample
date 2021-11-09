import io.turntabl.domain.Client;
import io.turntabl.domain.CorporateClient;
import io.turntabl.domain.PrivateClient;
import io.turntabl.domain.ServiceLevel;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void getClientName() {
        Client privateClient = new PrivateClient("Mickey D", "12", ServiceLevel.GOLD);
        Client coporateClient = new CorporateClient("Ghapoha", "122", ServiceLevel.PLATINUM);
        assertEquals("Mickey D", privateClient.getName());
        assertEquals("Ghapoha", coporateClient.getName());
    }
}
