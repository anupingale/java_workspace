package com.step.Logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsoleTest {
    @Test
    void logIntoConsole() {
        String log = "Logging from console.";
        Logger console = new Console(log);
        assertEquals(log, console.log());
    }
}