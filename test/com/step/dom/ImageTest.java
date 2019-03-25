package com.step.dom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageTest {

    @Test
    void shouldRefreshImage() {
        Component image = new Image();
        String actual = image.refresh();

        String expected = "Refreshing image";
        assertEquals(expected, actual);
    }
}