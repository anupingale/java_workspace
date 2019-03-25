package com.step.activitylog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ActivityLogWithTimeStamp {

    private List<Activity> activities;

    ActivityLogWithTimeStamp() {
        this.activities = new ArrayList<>();
    }

    List<Activity> addLog(String message, Integer timestamp) {
        this.activities.add(new Activity(message, timestamp));
        return Collections.unmodifiableList(this.activities);
    }
}
