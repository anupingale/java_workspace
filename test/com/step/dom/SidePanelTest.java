package com.step.dom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SidePanelTest {
    @Test
    void shouldRefreshSidePanel() {
        Component sidePanel = new SidePanel();

        String actual = sidePanel.refresh();
        String expected = "Refreshing side panel";

        assertEquals(expected,actual);
    }
}