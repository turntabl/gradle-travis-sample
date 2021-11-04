public class Main {
    public static void main(String[] args) {
        ClientRegister reg1 = new ClientRegister(
                new CorporateClient("Morgan Stanley", 1001, Service.PLATINUM),
                new CorporateClient("Fidelity", 1002, Service.GOLD),
                new CorporateClient("Cal Bank", 1003, Service.GOLD)
        );

        System.out.println(reg1.getClientList());
        System.out.println(reg1.getClientsNamesBasedOnService(Service.PLATINUM));
        System.out.println(reg1.getClientNameById(1002));
        System.out.println(reg1.getClientCountBasedOnService());
    }
}
