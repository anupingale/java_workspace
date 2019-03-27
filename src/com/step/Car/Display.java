package com.step.Car;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Display {
    private Map<Integer, Integer> details;

    Display() {
        this.details = new HashMap<>();
    }

    Map<Integer, Integer> getDisplay() {
        return Collections.unmodifiableMap(details);
    }

    void addDetail(ParkingLotDetails details) {
        this.details.put(details.parkingLotId,details.carCount);
    }
}
