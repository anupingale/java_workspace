package com.step.Car;

public class Assistant implements Displayable {

    private Display display;

    Assistant(Display display) {
        this.display = display;
    }

    @Override
    public void updateDisplay(ParkingLotDetails details) {
        this.display.addDetail(details);
    }

}
