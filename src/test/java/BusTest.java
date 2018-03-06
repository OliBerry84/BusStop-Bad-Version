import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Passenger passenger;

    @Before
    public void before() {
        bus = new Bus();
        passenger = new Passenger();
    }

    @Test
    public void totalPassenger(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canAddIfPossible(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);

        assertEquals(3, bus.passengerCount());

    }

    @Test
    public void canRemovePassenger(){
      bus.addPassenger(passenger);
      bus.addPassenger(passenger);
      assertEquals(2, bus.passengerCount());
      bus.removePassenger(passenger);
      assertEquals(1, bus.passengerCount());
    }
}
