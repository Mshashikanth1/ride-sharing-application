package Service;

import Entity.User;
import Repostitory.UserRepository;
import Enum.Gender;

import java.util.stream.Collectors;

public class UserService {


    public void addUser(String name, Gender gender, int age) {
        UserRepository.save(new User(age,gender,name));
    }

    public void printUsers(){
        UserRepository.findAll().stream().map(User::toString).forEach(System.out::println);
    }
}
