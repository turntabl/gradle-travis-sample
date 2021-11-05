import io.turntabl.domain.Client;
import io.turntabl.domain.CorporateClient;
import io.turntabl.domain.PrivateClient;
import io.turntabl.domain.ServiceLevel;
import io.turntabl.service.RegisterService;
import io.turntabl.service.impl.RegisterServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class RegisterServiceImplTest {
    @Mock
    private RegisterService registerService;
    private RegisterServiceImpl registerServiceImpl;

    @Before
    public void init() {
        Client coporateClient = new CorporateClient("ECG", "2332", ServiceLevel.GOLD);
        Client coporateClient2 = new CorporateClient("FIDELITY BANK", "2332", ServiceLevel.GOLD);
        Client privateClientDee = new PrivateClient("Mickey D Luffy", "233", ServiceLevel.PLATINUM);
        Client privateClientJhey = new PrivateClient("Jhey", "2348", ServiceLevel.PLATINUM);
        Client privateClientHancok = new PrivateClient("Boa Hancok", "78", ServiceLevel.PLATINUM);

        Client privateClientMikey = new PrivateClient("Mike", "23", ServiceLevel.PREMIUM);
        Client privateClientMikey2 = new PrivateClient("Restre", "34", ServiceLevel.PREMIUM);
         registerServiceImpl =
                new RegisterServiceImpl(List.of(coporateClient,privateClientMikey,privateClientMikey2, coporateClient2, privateClientDee,privateClientJhey,privateClientHancok));

    }
    @Test
    public void getContactNames() {
        Mockito.when(registerService.getContactNames(ServiceLevel.GOLD))
                        .thenReturn(List.of("ECG", "FIDELITY BANK"));
        assertEquals("Only ECG and FIDELITY clients belong to the gold Service",
                registerServiceImpl.getContactNames(ServiceLevel.GOLD), List.of("ECG", "FIDELITY BANK"));

    }

    @Test
    public void getClientNameById() {
       assertEquals(registerServiceImpl.getClientNameById("2332COP").get(), "ECG");
    }


    @Test
    public void countClientsPerServiceLevel() {
        Map<ServiceLevel, Long> countPerLevel = Map.of(ServiceLevel.GOLD, 2L, ServiceLevel.PLATINUM, 3L, ServiceLevel.PREMIUM, 2L);
        assertEquals(registerServiceImpl.countClientsPerServiceLevel(), countPerLevel);
        registerServiceImpl.countClientsPerServiceLevel();
    }

}
