package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client = new CorporateClient("Fidelity Bank", 67, ServiceLevel.Gold);



        System.out.println(client);
    }
}
