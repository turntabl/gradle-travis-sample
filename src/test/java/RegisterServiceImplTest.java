import io.turntabl.domain.Client;
import io.turntabl.domain.CorporateClient;
import io.turntabl.domain.ServiceLevel;
import io.turntabl.service.impl.RegisterServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RegisterServiceImplTest {

    @Test
    public void getContactNames() {
        Client coporateClient = new CorporateClient("ECG", "2332", ServiceLevel.GOLD);
        Client coporateClient2 = new CorporateClient("FIDELITY BANK", "2332", ServiceLevel.GOLD);
        Client privateClientDee = new CorporateClient("Mickey D Luffy", "23", ServiceLevel.PLATINUM);
        Client privateClientJhey = new CorporateClient("Jhey", "23", ServiceLevel.PLATINUM);
        Client privateClientHancok = new CorporateClient("Boa Hancok", "23", ServiceLevel.PLATINUM);
        RegisterServiceImpl registerServiceImpl =
                new RegisterServiceImpl(List.of(coporateClient,coporateClient2, privateClientDee,privateClientJhey,privateClientHancok));

        Assert.assertEquals("Only ECG and FIDELITY clients belong to the gold Service",
                registerServiceImpl.getContactNames(ServiceLevel.GOLD), List.of("ECG", "FIDELITY BANK"));

    }


}
