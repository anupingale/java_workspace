package com.step.bootCamp;

public class Square implements Shape {
    private final Dimension side;

    public Square(Dimension side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.side.getValue(), 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * this.side.getValue();
    }
}
