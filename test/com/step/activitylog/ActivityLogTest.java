package com.step.activitylog;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActivityLogTest {
    @Test
    void shouldAddLogToActivityLog() {
        ActivityLog activityLog = new ActivityLog(ActivityLog.TimestampType.NO_TIMESTAMP);
        String log = "first log";
        List<Activity> actualActivities = activityLog.addLog(log);
        List<Activity> expectedActivities = new ArrayList<>();
        expectedActivities.add(new Activity(log));
        assertEquals(expectedActivities, actualActivities);
    }
}