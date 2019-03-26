package com.step.Car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingLotTest {


    class MockedAttendant extends Attendant {
        protected boolean isCalled = false;

        @Override
        public String notify(String notification) {
            isCalled = true;
            return notification;
        }
    }

    @Test
    void shouldParkACar() {
        ParkingLot parkingLot1 = new ParkingLot(5);
        Car car = new Car("BMW");
        parkingLot1.park(car);
        assertEquals(1, parkingLot1.getCarCount());
    }

    @Test
    void shouldNotParkACar() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car("BMW");
        parkingLot.park(car);
        assertEquals(1, parkingLot.getCarCount());
        parkingLot.park(car);
        assertEquals(1, parkingLot.getCarCount());
    }

    @Test
    void shouldUnParkACar() {
        ParkingLot parkingLot = new ParkingLot(2);
        Car bmw = new Car("BMW");
        parkingLot.park(bmw);
        Car lamborghini = new Car("Lamborghini");
        parkingLot.park(lamborghini);
        parkingLot.unPark(bmw);
        assertEquals(1, parkingLot.getCarCount());
    }

    @Test
    void shouldNotifyAttendantIfParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car bmw = new Car("BMW");
        Car lamborghini = new Car("Lamborghini");
        MockedAttendant attendant = new MockedAttendant();

        parkingLot.addObserver(attendant);
        parkingLot.park(bmw);
        parkingLot.park(lamborghini);
        assertTrue(attendant.isCalled);
    }

    @Test
    void shouldNotifyAttendantIfParkingLotBecomeAvailable() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car bmw = new Car("BMW");
        MockedAttendant attendant = new MockedAttendant();

        parkingLot.addObserver(attendant);
        parkingLot.park(bmw);
        parkingLot.unPark(bmw);
        assertTrue(attendant.isCalled);
    }
}