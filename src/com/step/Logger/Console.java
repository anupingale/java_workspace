package com.step.Logger;

public class Console implements Logger {
    private String log;

    Console(String log) {
        this.log = log;
    }

    @Override
    public String log() {
        return log;
    }
}
