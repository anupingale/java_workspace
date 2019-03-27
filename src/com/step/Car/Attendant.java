package com.step.Car;

import java.util.ArrayList;
import java.util.List;

class Attendant implements Observer {
    private List<ParkingLot> parkingLots;
    private Assistant assistant;


    Attendant(Assistant assistant) {
        this.parkingLots = new ArrayList<>();
        this.assistant = assistant;
    }

    Attendant addParkingLot(ParkingLot parkingLot) {
        this.parkingLots.add(parkingLot);
        this.updateDisplay(parkingLot.getDetails());
        parkingLot.addObserver(this);
        return this;
    }

    int getParkingLotCount() {
        return this.parkingLots.size();
    }


    @Override
    public void notify(String notification) {
        System.out.println(notification);
    }

    @Override
    public void updateDisplay(ParkingLotDetails details) {
        this.assistant.updateDisplay(details);
    }

}
