package io.turntabl;


import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class ClientRegister {
    private List<Client> clients;

    public ClientRegister(List<Client> clients) {
        this.clients = clients;
    }


    public List<Client> getClients() {
        return clients;
    }

    public List<Client> getContactGoldClients(List<Client> clients) {
        List<Client> goldClients = clients.stream().filter(client -> client.getServiceLevel() == ServiceLevel.Gold).collect(Collectors.toList());
        return goldClients;
    }

    public Optional<Client> getClientByID(int id) {
        Optional clientById = Optional.ofNullable(clients.stream().filter(client -> client.getId() == id).findFirst().orElse(null));
        if (clientById == Optional.empty()) {
            System.out.println("Client does not exist");
        }
        return clientById;
    }

    public Map<ServiceLevel, List<Client>> countClientByServiceLevel(ServiceLevel serviceLevel, List<Client> client) {
        Map<ServiceLevel, List<Client>> clientByServiceLevel = this.clients.stream().collect(groupingBy(Client::getServiceLevel));


                return null;
    }


}
