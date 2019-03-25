package com.step.dom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {
    @Test
    void shouldRefreshTheText() {
        Component text = new Text();

        String actual = text.refresh();
        String expected = "Refreshing text";

        assertEquals(expected,actual);
    }
}