package com.step.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class ParkingLot extends Observable {
    private final int parkingLotSize;
    private static int id = 1;
    private boolean isLotFull = false;
    private final int parkingLotId;
    private List<Car> cars;


    ParkingLot(int parkingLotSize) {
        this.parkingLotSize = parkingLotSize;
        this.cars = new ArrayList<>(parkingLotSize);
        this.parkingLotId = id;
        id++;
    }

    private boolean isParkingAvailable() {
        int emptyLot = cars.stream().filter(Objects::isNull).toArray().length;
        int availableLot = cars.size() - emptyLot;
        if (availableLot < parkingLotSize) return true;
        isLotFull = true;
        this.notify(String.format("Parking lot - %d  is full", this.parkingLotId));
        return false;
    }

    ParkingLotDetails getDetails() {
        return new ParkingLotDetails(this.parkingLotId, this.getCarCount());
    }

    private void addCar(int parkingId, Car car) {
        cars.add(parkingId, car);
        this.updateDisplay(this.getDetails());
    }

    int park(Car car) {
        int parkingId = cars.indexOf(null);
        if (parkingId < 0) parkingId = cars.size();
        if (isParkingAvailable()) addCar(parkingId, car);
        isParkingAvailable();
        return cars.indexOf(car);
    }


    void unPark(int parkingId) {
        if (isLotFull) this.notify(String.format("Parking lot - %d  is available", parkingLotId));
        cars.remove(parkingId);
        cars.add(parkingId, null);
        this.updateDisplay(this.getDetails());
    }

    int getCarCount() {
        return cars.stream().filter(Objects::nonNull).toArray().length;
    }

}
