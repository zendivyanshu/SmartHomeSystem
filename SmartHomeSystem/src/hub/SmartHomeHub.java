package hub;

import devices.SmartDevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartHomeHub {
    private Map<Integer, SmartDevice> deviceRegistry;
    private List<String> scheduledTasks;
    private List<String> automatedTriggers;

    public SmartHomeHub() {
        deviceRegistry = new HashMap<>();
        scheduledTasks = new ArrayList<>();
        automatedTriggers = new ArrayList<>();
    }

    public void registerDevice(SmartDevice device) {
        deviceRegistry.put(device.getId(), device);
    }

    public void addSchedule(int deviceId, String time, String action) {
        scheduledTasks.add("Scheduled task for device " + deviceId + " at " + time + ": " + action);
    }

    public void addTrigger(int deviceId, String condition, String comparisonOperator, int threshold, String action) {
        automatedTriggers.add("Trigger set for device " + deviceId + " on condition " + condition +
                " " + comparisonOperator + " " + threshold + ": " + action);
    }

    public List<String> getScheduledTasks() {
        return scheduledTasks;
    }

    public List<String> getAutomatedTriggers() {
        return automatedTriggers;
    }
}
