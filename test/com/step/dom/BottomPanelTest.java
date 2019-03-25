package com.step.dom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottomPanelTest {
    @Test
    void shouldRefreshBottomPanel() {
        Component bottomPanel = new BottomPanel();

        String actual = bottomPanel.refresh();
        String expected = "Refreshing bottom panel";

        assertEquals(expected,actual);
    }

}