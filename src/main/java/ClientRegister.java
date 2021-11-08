import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClientRegister {
   private ArrayList<Client> clientList;

   public ClientRegister(Client... client){
      this.clientList = new ArrayList<>(Arrays.asList(client));
   }
   public ArrayList<Client> getClientList() {
      return clientList;
   }

   public List<String> getClientsNamesBasedOnService(Service service){
      return this.clientList.stream().filter(client -> client.getServiceLevel().equals(service))
              .map(Client::getName)
              .collect(Collectors.toList());
   }

   public String getClientNameById(int id){
      List<Client> cl = this.clientList.stream().filter(client -> client.getId() == id).collect(Collectors.toList());
      return cl.isEmpty()? "No client found" : cl.get(0).getName();
   }

   public String getClientCountBasedOnService(){
      int[] count = {0, 0, 0}; //count[0] = GOLD, count[1] = PREMIUM, count[2] = PLATINUM
      for(Client client : clientList){
         if(client.serviceLevel.equals(Service.GOLD)){
            count[0] += 1;
         }else if(client.serviceLevel.equals(Service.PREMIUM)){
            count[1] += 1;
         }else{
            count[2] +=1;
         }
      }
      return "Gold clients: "+count[0] + ", Premium clients: "+count[1] + ", Platinum clients: "+count[2];
   }
}
