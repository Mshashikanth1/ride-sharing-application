package Service;

import Entity.Ride;
import Entity.User;
import Entity.Vechile;
import Repostitory.UserRepository;
import Exception.RideSharingServiceException;

import java.util.Optional;

public class RideService {


    public void offerRide(String name, String origin, int noOfSeats, String type, String number, String destination) {

        User user=  UserRepository.findById(name);
        Vechile vechile= Optional.of(user.getVechile(number)).orElseThrow( () -> new RideSharingServiceException("User has no vechile can't offer ride"));

        if( vechile.getRide() ==null) {
            vechile.setRide(new Ride(origin, type, noOfSeats));
            user.addVechile(vechile);
            UserRepository.update(user);
        }
        else throw  new RideSharingServiceException("Vechile already  has A ride : " + vechile +" : " + vechile.getRide());

    }
}
