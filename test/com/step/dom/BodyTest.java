package com.step.dom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BodyTest {

    @Test
    void shouldRefreshBodyAndAllItsChildren() {
        Component body = new Body();
        body.appendChild(new SidePanel());
        body.appendChild(new BottomPanel());
        Component content = new Content();
        content.appendChild(new Image());
        content.appendChild(new Text());
        body.appendChild(content);

        String actual = body.refresh();
        String expected = "Refreshing body\n" +
                "Refreshing side panel\n" +
                "Refreshing bottom panel\n" +
                "Refreshing content\n" +
                "Refreshing image\n" +
                "Refreshing text";

        assertEquals(expected, actual);
    }
}