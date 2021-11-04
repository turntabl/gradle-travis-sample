import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private List<Client> clientList;

    //    Register constructor
    public Register(List<Client> clientList) {
        this.clientList = clientList;
    }

    /*
    function to return names of clients having GOLD Service level
     */
    public List<String> getClientNamesBasedOnGold() {
//        List<String> names = new ArrayList<>();
////imperative style
//        for(Client client : clientList){
//            if(client.getService().equals(Service.GOLD)){
//                names.add(client.getName());
//            }
//        }
//        return names;
//
        return this.clientList.stream().filter(client -> client.getService().equals(Service.GOLD)).map(client -> client.getName()).collect(Collectors.toList());
    }

    public String getClientNameById(int id){
//        String name = null;
//        for(Client client : clientList){
//            if(client.getId() == id){
//                name = client.getName();
//            }else{
//                name = "No client found";
//            }
//        }
//        return name;

        List<Client> listC = this.clientList.stream().filter( client -> client.getId() ==id).collect(Collectors.toList());
        return listC.isEmpty()? "No client found" : listC.get(0).getName();
    }

}
