package com.step.Logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogFileTest {
    @Test
    void logIntoFile() {
        String log = "Logging from file.";
        Logger logFile = new File(log);
        assertEquals(log,logFile.log());
    }
}