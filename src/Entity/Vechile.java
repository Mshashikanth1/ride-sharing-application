package Entity;

import java.util.UUID;

public class Vechile {
        private String  name;

        public Vechile(String name, String type, String number) {
                this.name = name;
                this.type = type;
                this.number = number;
        }

        public String getName() {
                return name;
        }

        @Override
        public String toString() {
                return "Vechile{" +
                        "name='" + name + '\'' +
                        ", type='" + type + '\'' +
                        ", number='" + number + '\'' +
                        '}';
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getNumber() {
                return number;
        }

        public void setNumber(String number) {
                this.number = number;
        }

        private String type;
        private String number;


        public Ride getRide() {
                return ride;
        }

        public void setRide(Ride ride) {
                this.ride = ride;
        }

        private Ride ride;


}
