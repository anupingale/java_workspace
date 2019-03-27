package com.step.Car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AttendantTest {
    private Assistant assistant;
    private Attendant attendant;
    private Display display;
    private ParkingLot parkingLot1;
    private ParkingLot parkingLot2;

    @BeforeEach
    void setUp() {
        parkingLot1 = new ParkingLot(1);
        parkingLot2 = new ParkingLot(1);
        display = new Display();
        assistant = new Assistant(display);
        attendant = new Attendant(assistant);
    }

    @Test
    void shouldAssignParkingLotToAttendant() {
        attendant.addParkingLot(parkingLot1).addParkingLot(parkingLot2);
        assertEquals(2, attendant.getParkingLotCount());
    }

    @Test
    void shouldReturnParkingLotStatusDisplay() {
        Car lamborghini = new Car("lamborghini", 1);
        Car audi = new Car("Audi", 2);

        parkingLot1.park(lamborghini);
        parkingLot2.park(audi);
        attendant.addParkingLot(parkingLot1).addParkingLot(parkingLot2);

        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(3, 1);
        expected.put(4, 1);

        assertEquals(expected, display.getDisplay());
    }
}