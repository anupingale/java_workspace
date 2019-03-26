package com.step.Car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AttendantTest {

    @Test
    void shouldAssignParkingLotToAttendant() {
        Attendant attendant = new Attendant();

        ParkingLot parkingLot1 = new ParkingLot(1);
        ParkingLot parkingLot2 = new ParkingLot(1);

        attendant.addParkingLot(parkingLot1);
        attendant.addParkingLot(parkingLot2);

        assertEquals(2, attendant.getParkingLotCount());
    }
}