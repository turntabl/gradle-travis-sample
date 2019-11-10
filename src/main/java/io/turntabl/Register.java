package io.turntabl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {
    List<TurntablClients> turntablClients;

    public Register(List<TurntablClients> turntablClients) {
        this.turntablClients = turntablClients;
    }

    public List<TurntablClients> getTurntablClients() {
        return turntablClients;
    }

    public List<String> getListOfGoldClient() {
        /*List<TurntablClients> listOfGoldClients = new ArrayList<>();
        for (TurntablClients goldClients : turntablClients){
            if (goldClients.getServiceLevel() == ServiceLevel.Gold){
                listOfGoldClients.add(goldClients);
            }
        }
        return listOfGoldClients;
    }*/
        List<String> listOfGoldClients = turntablClients.stream()
                .filter(turntablClients -> turntablClients.getServiceLevel().equals(ServiceLevel.Gold))
                .map(turntablClients -> turntablClients.getClientsName())
                .collect(Collectors.toList());
        return listOfGoldClients;
    }

    public Optional<String> getClientById(String id){
        return turntablClients.stream()
                .filter(turntablClients -> turntablClients.getClientsId().equals(id))
                .map(turntablClients -> turntablClients.getClientsName()).findAny();
    }

    public Map<ServiceLevel, Integer> numberOfClientsAtEveryLevel(){
       Map<ServiceLevel, Integer> numberOfClients = new HashMap<>();
       numberOfClients.put(ServiceLevel.Platinum, 0);
       numberOfClients.put(ServiceLevel.Gold, 0);
       numberOfClients.put(ServiceLevel.Premium, 0);

       turntablClients.stream().map(TurntablClients::getServiceLevel)
               .forEach(serviceLevel -> {int count = numberOfClients.get(serviceLevel)+1;
                    numberOfClients.put(serviceLevel, count);
                    }
               );
       return numberOfClients;
    }
}