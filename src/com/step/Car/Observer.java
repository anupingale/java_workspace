package com.step.Car;

interface Observer {
    void notify(String notification);
    void updateDisplay(ParkingLotDetails details);
}
