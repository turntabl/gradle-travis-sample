package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client = new CorporateClient("Fidelity Bank", 67, ServiceLevel.Gold);

        ClientRegister clientRegister = new ClientRegister(
                List.of(
                        new PrivateClient("John Services", 67, ServiceLevel.Gold),
                        new CorporateClient("Fidelity Bank", 56, ServiceLevel.Silver),
                        new CorporateClient("Morgan Stanley", 78, ServiceLevel.Gold)
        ));

        System.out.println(clientRegister.getClientByID(90));



//        System.out.println(client);
    }
}
