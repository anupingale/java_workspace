package com.step.Car;

import java.util.ArrayList;
import java.util.List;

class Attendant implements Observer {
    List<ParkingLot> parkingLots;

    Attendant() {
        this.parkingLots = new ArrayList<>();
    }

    void addParkingLot(ParkingLot parkingLot) {
        this.parkingLots.add(parkingLot);
        parkingLot.addObserver(this);
    }

    int getParkingLotCount() {
        return this.parkingLots.size();
    }

    @Override
    public String notify(String notification) {
        System.out.println(notification);
        return notification;
    }
}
