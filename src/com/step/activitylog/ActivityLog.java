package com.step.activitylog;

import java.util.*;

class ActivityLog {

    private List<Activity> activities;
    private static Map<TimestampType, TimestampGenerator> timestampGenerators;
    private TimestampType timestampType;

    static {
        timestampGenerators = new HashMap<>();
        TimestampGenerator millisecondTimeStampGenerator = () -> (int) (Math.random() + 1) * 100;
        TimestampGenerator secondsTimeStampGenerator = () -> (int) (Math.random() + 1) * 200;
        TimestampGenerator noTimestampGenerator = () -> 0;

        timestampGenerators.put(TimestampType.NO_TIMESTAMP, noTimestampGenerator);
        timestampGenerators.put(TimestampType.MILLISECONDS, millisecondTimeStampGenerator);
        timestampGenerators.put(TimestampType.SECONDS, secondsTimeStampGenerator);
    }

    ActivityLog(TimestampType timestampType) {
        this.activities = new ArrayList<>();
        this.timestampType = timestampType;
    }

    List<Activity> addLog(String log) {
        Integer timestamp = timestampGenerators.get(this.timestampType).generateTimestamp();
        this.activities.add(new Activity(log, timestamp));
        return Collections.unmodifiableList(this.activities);
    }

    private interface TimestampGenerator {
        Integer generateTimestamp();
    }

    enum TimestampType {
        NO_TIMESTAMP,
        MILLISECONDS,
        SECONDS
    }
}
