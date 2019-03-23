package com.step.Logger;

import java.util.ArrayList;

abstract class LogSystem {
    private ArrayList<Logger> loggers;

    public LogSystem() {
        this.loggers = new ArrayList<>();
    }

    void addLogger(Logger logger) {
        loggers.add(logger);
        notifyUser("New logger is added");
    }

    void removeLogger(Logger logger) {
        this.loggers.remove(logger);
        notifyUser("New logger is added");
    }

    private void notifyUser(String log) {
        for (Logger logger : loggers) {
            logger.log();
        }
    }

}
