package Entity;

public class Ride {
    private String origin;
    private String destination;

    @Override
    public String toString() {
        return "Ride{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", availableSeats='" + availableSeats + '\'' +
                '}';
    }

    private int availableSeats;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Ride(String origin, String destination, int availableSeats) {
        this.origin = origin;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }
}
