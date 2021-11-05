package io.turntabl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientRegister {

    List<PrivateClient> privateClientList = new ArrayList<>();
    List<CorporateClient> corporateClientList = new ArrayList<>();



    public List<Client> allClients(){
        return  (Stream.concat( privateClientList.stream(), corporateClientList.stream())).collect(Collectors.toList());
    }

    public ClientRegister(List<PrivateClient> privateClientList, List<CorporateClient> corporateClientList) {
        this.privateClientList = privateClientList;
        this.corporateClientList = corporateClientList;
    }

    public List<PrivateClient> getPrivateClientList() {
        return privateClientList;
    }

    public void setPrivateClientList(List<PrivateClient> privateClientList) {
        this.privateClientList = privateClientList;
    }

    public List<CorporateClient> getCorporateClientList() {
        return corporateClientList;
    }

    public void setCorporateClientList(List<CorporateClient> corporateClientList) {
        this.corporateClientList = corporateClientList;
    }

    public List<String> getAllGoldClient(){
//        List<String> clients = new ArrayList<>();
         return  allClients().stream().filter(s ->s.getServiceLevel()==ServiceLevel.GOLD).map(s -> s.getContactName()).collect(Collectors.toList());
    }

    public String getClientNameById(String id){
         String clientNameById = allClients().stream().filter(s -> s.getId() == id).map(s ->s.getName()).toString();
//         version 2
//        String clientNameById = allClients().stream().filter(s -> s.getId() == id).map(s ->s.getName()).findAny().orElse(" ");
               return clientNameById;
    }

    public Map<ServiceLevel, Long> countsClientAtAllLevels(){
        Map<ServiceLevel, Long> countClients = new HashMap<>();
        Map<ServiceLevel, List<Client> > groupLevelClients = allClients().stream().collect(Collectors.groupingBy(Client::getServiceLevel));
        for (Map.Entry<ServiceLevel, List<Client>> clientList2:
                groupLevelClients.entrySet()
             ) {

          countClients.put(clientList2.getKey(),clientList2.getValue().stream().count());

        }
        return countClients;
    }

}
