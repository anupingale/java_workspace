package com.step.Car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingLotTest {

    class MockedAttendant extends Attendant {
        boolean isCalled = false;

        MockedAttendant(Assistant assistant) {
            super(assistant);
        }

        @Override
        public void notify(String notification) {
            isCalled = true;
        }
    }

    @Test
    void shouldParkACar() {
        ParkingLot parkingLot1 = new ParkingLot(5);
        Car car = new Car("BMW", 1);
        parkingLot1.park(car);
        assertEquals(1, parkingLot1.getCarCount());
    }

    @Test
    void shouldNotParkACar() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car("BMW", 1);
        parkingLot.park(car);
        assertEquals(1, parkingLot.getCarCount());
        parkingLot.park(car);
        assertEquals(1, parkingLot.getCarCount());
    }

    @Test
    void shouldUnParkACar() {
        ParkingLot parkingLot = new ParkingLot(2);
        Car bmw = new Car("BMW", 1);
        int BMWId = parkingLot.park(bmw);
        Car lamborghini = new Car("Lamborghini", 2);
        parkingLot.park(lamborghini);
        parkingLot.unPark(BMWId);
        assertEquals(1, parkingLot.getCarCount());
    }

    @Test
    void shouldNotifyAttendantIfParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car bmw = new Car("BMW", 1);
        Car lamborghini = new Car("Lamborghini", 1);
        MockedAttendant attendant = new MockedAttendant(new Assistant(new Display()));

        parkingLot.addObserver(attendant);
        parkingLot.park(bmw);
        parkingLot.park(lamborghini);
        assertTrue(attendant.isCalled);
    }

    @Test
    void shouldNotifyAttendantIfParkingLotBecomeAvailable() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car bmw = new Car("BMW", 1);

        MockedAttendant attendant = new MockedAttendant(new Assistant(new Display()));
        parkingLot.addObserver(attendant);
        int BMWId = parkingLot.park(bmw);
        parkingLot.unPark(BMWId);
        assertTrue(attendant.isCalled);
    }
}