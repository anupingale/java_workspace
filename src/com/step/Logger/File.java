package com.step.Logger;

public class File implements Logger {
    private final String log;

    File(String log) {
        this.log = log;
    }

    @Override
    public String log() {
        return log;
    }
}
