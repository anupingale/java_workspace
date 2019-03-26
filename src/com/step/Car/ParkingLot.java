package com.step.Car;

import java.util.ArrayList;
import java.util.List;

class ParkingLot extends Observable {
    private final int parkingLotSize;
    private static int id = 0;
    private boolean isLotFull = false;
    private final int parkingLotId;
    List<Car> parkingLot;


    ParkingLot(int parkingLotSize) {
        this.parkingLotSize = parkingLotSize;
        this.parkingLot = new ArrayList<>();
        this.parkingLotId = id;
        id++;
    }

    private boolean isParkingAvailable() {
        if (parkingLot.size() >= parkingLotSize) {
            this.notify(String.format("Parking lot - %d  is full", this.parkingLotId));
            isLotFull = true;
            return false;
        }
        return true;
    }

    void park(Car car) {
        if (isParkingAvailable()) {
            parkingLot.add(car);
        }
        isParkingAvailable();
    }


    void unPark(Car car) {
        if (isLotFull) {
            this.notify(String.format("Parking lot - %d  is available", this.parkingLotId));
            isLotFull = false;
        }
        parkingLot.remove(car);
    }

    int getCarCount() {
        return parkingLot.size();
    }

}
