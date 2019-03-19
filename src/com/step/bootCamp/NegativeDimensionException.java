package com.step.bootCamp;

public class NegativeDimensionException extends Exception {
    private String message = "Negative dimension exception";

    public String getMessage() {
        return this.message;
    }
}
