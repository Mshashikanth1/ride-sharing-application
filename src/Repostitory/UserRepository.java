package Repostitory;

import Entity.User;
import Exception.RideSharingServiceException;

import java.util.*;

public class UserRepository {
    static Map<String, User>  userDb=  new HashMap<>();

    public static Collection<User> findAll(){
        return userDb.values();
    }

    public static User findById(final String name) {
        return  Optional.of(userDb.get(name)).orElseThrow(()-> new RideSharingServiceException("User Not Found"));
    }

    public static void save(final User user){
        if( userDb.containsKey(user.getName())) throw new RideSharingServiceException("User Already Exists : " + user.getName());
        userDb.put(user.getName() , user);
    }

    public static void update(final User user){
        if( !userDb.containsKey(user.getName())) throw new RideSharingServiceException("User Doesn't Exists");
        userDb.put(user.getName() , user);
    }

}
