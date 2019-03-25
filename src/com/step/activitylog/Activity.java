package com.step.activitylog;

import java.util.Objects;

class Activity {
    private final String message;
    private final Integer timestamp;

    Activity(String message, Integer timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    Activity(String message) {
        this(message, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(message, activity.message);
    }
}
