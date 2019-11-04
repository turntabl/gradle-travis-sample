import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Register {
    List<ClientNames> clientName;
    String clientID;
    ServiceLevel serviceLevel;

    public Register(List<ClientNames> clientName, String clientID, ServiceLevel serviceLevel) {
        this.clientName = clientName;
        this.clientID = clientID;
        this.serviceLevel = serviceLevel;
    }

    public List<ClientNames> getClientName() {
        return clientName;
    }

    public String getClientID() {
        return clientID;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public Optional<ClientNames> namesOfClients(){

        return clientName.stream()
                .filter(gold -> gold.equals(ServiceLevel.Gold))
                .findAny();
    }

    public Optional<String> clientNamesById(String name){
        List<String> nameById = new ArrayList<>();
        for(ClientNames id : clientName ){
            if (id.getClientNames().equals(clientID)){
                return Optional.of(name);
            }
        }
        return Optional.empty();
    }



}
