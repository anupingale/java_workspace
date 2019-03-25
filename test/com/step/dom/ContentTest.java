package com.step.dom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContentTest {

    @Test
    void shouldRefreshContentAndAllItsChildren() {
        Component content = new Content();

        content.appendChild(new Image());
        content.appendChild(new Text());

        String actual = content.refresh();
        String expected = "Refreshing content\nRefreshing image\nRefreshing text";
        assertEquals(expected,actual);
    }
}