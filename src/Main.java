import Service.RideService;
import Service.UserService;
import Service.VechileService;

import static Enum.Gender.F;
import static Enum.Gender.M;
import Exception.RideSharingServiceException;

public class Main {





    public static void main(String[] args) {
        System.out.println("Hello world!");

        UserService userService=new UserService();
        VechileService vechileService=new VechileService();
        RideService rideService=new RideService();

        onboardingTests(userService,vechileService);
        offerRideTests(rideService);

        userService.printUsers();
        

    }
    
    public static  void  onboardingTests(UserService userService, VechileService vechileService){
        userService.addUser("Rohan", M, 36);
        vechileService.addVehicle("Rohan", "Swift", "KA-01-12345");
        userService.addUser("Shashank", M, 29);
        vechileService.addVehicle("Shashank", "Baleno", "TS-05-62395");
        userService.addUser("Nandini", F, 29);
        userService.addUser("Shipra", F, 27) ;
        vechileService.addVehicle("Shipra", "Polo", "KA-05-41491");
        vechileService.addVehicle("Shipra", "Activa", "KA-12-12332");
        userService.addUser("Gaurav", M, 29);
        userService.addUser("Rahul", M, 35);
        vechileService.addVehicle("Rahul", "XUV", "KA-05-1234");
    }

    public static void  offerRideTests( RideService rideService){

        rideService.offerRide("Rohan", "Hyderabad", 1, "Swift", "KA-01-12345", "Bangalore");
        rideService.offerRide("Shipra", "Bangalore", 1, "Activa" ,"KA-12-12332", "Mysore");
        rideService.offerRide("Shipra", "Bangalore", 2, "Polo", "KA-05-41491", "Mysore");
        rideService.offerRide("Shashank", "Hyderabad", 2, "Baleno", "TS-05-62395", "Bangalore");
        rideService.offerRide("Rahul", "Hyderabad", 5, "XUV",  "KA-05-1234", "Bangalore");

        try {
            rideService.offerRide("Rohan", "Bangalore", 1, "Swift", "KA-01-12345", "Pune");
        } catch (RideSharingServiceException ex){
            System.out.println(ex.getMessage());
        }

        
    }


}