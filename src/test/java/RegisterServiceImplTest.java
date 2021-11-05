import io.turntabl.domain.Client;
import io.turntabl.domain.CorporateClient;
import io.turntabl.domain.PrivateClient;
import io.turntabl.domain.ServiceLevel;
import io.turntabl.service.impl.RegisterServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RegisterServiceImplTest {
    private RegisterServiceImpl registerServiceImpl;

    @Before
    public void init() {
        Client coporateClient = new CorporateClient("ECG", "2332", ServiceLevel.GOLD);
        Client coporateClient2 = new CorporateClient("FIDELITY BANK", "2332", ServiceLevel.GOLD);
        Client privateClientDee = new PrivateClient("Mickey D Luffy", "23", ServiceLevel.PLATINUM);
        Client privateClientJhey = new PrivateClient("Jhey", "234", ServiceLevel.PLATINUM);
        Client privateClientHancok = new PrivateClient("Boa Hancok", "23", ServiceLevel.PLATINUM);
         registerServiceImpl =
                new RegisterServiceImpl(List.of(coporateClient,coporateClient2, privateClientDee,privateClientJhey,privateClientHancok));

    }
    @Test
    public void getContactNames() {

        assertEquals("Only ECG and FIDELITY clients belong to the gold Service",
                registerServiceImpl.getContactNames(ServiceLevel.GOLD), List.of("ECG", "FIDELITY BANK"));

    }

    @Test
    public void getClientNameById() {
        System.out.println(registerServiceImpl.getClientNameById("23PVT").get());
       assertEquals(registerServiceImpl.getClientNameById("2332COP").get(), "ECG");
    }



}
