import java.util.ArrayList;

public class Bus {
    private String destination;
    private Integer capacity;
    private ArrayList<Passenger> passengers;

    public Bus(){
        this.destination = destination;
        this.capacity = 3;
        this.passengers = new ArrayList<Passenger>();

    }

    public int passengerCount() {  // MVP 1 - Count passenger in Bus
        return passengers.size();
    }

    public boolean isFull() {
        return passengerCount() >= this.capacity;
    }

    public void addPassenger(Passenger passenger) {
        if(!isFull()) {
            passengers.add(passenger);
        }

    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }
}


