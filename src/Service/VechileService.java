package Service;

import Entity.User;
import Entity.Vechile;
import Repostitory.UserRepository;

public class VechileService {


    public void addVehicle(String name, String type, String number) {
        User user = UserRepository.findById(name);
        user.addVechile(new Vechile(name,type,number));
        UserRepository.update(user);
    }

    public Vechile getVechile(String name, String number){
        User user=  UserRepository.findById(name);
        Vechile vechile= user.getVechile(number);
        return vechile;
    }


}
