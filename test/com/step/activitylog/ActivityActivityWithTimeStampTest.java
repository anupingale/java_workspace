package com.step.activitylog;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityActivityWithTimeStampTest {
    @Test
    void shouldAddActivityWithGivenTimestamp() {
        ActivityLogWithTimeStamp activityLog = new ActivityLogWithTimeStamp();
        List<Activity> actualActivities = activityLog.addLog("first activity",1454567);

        List<Activity> expectedActivities = new ArrayList<>();
        Activity activity = new Activity("first activity",1454567);
        expectedActivities.add(activity);

        assertEquals(expectedActivities,actualActivities);

    }
}