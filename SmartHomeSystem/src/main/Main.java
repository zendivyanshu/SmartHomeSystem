import devices.*;

import java.util.*;

public class Main {
    private static List<SmartDevice> devices = new ArrayList<>();

    public static void main(String[] args) {
        initializeDevices();

        // Simulate commands
        simulateCommands();

        // Print status report after commands
        printStatusReport();

        // Schedule tasks
        scheduleTasks();

        // Simulate automation triggers
        simulateAutomationTriggers();

        // Print status report after automation triggers
        printStatusReport();
    }

    private static void initializeDevices() {
        // Add devices based on inputs
        devices.add(new Light(1, "off"));
        devices.add(new Thermostat(2, 70));
        devices.add(new DoorLock(3, "locked"));
    }

    private static void simulateCommands() {
        // Simulate commands based on inputs
        for (SmartDevice device : devices) {
            if (device.getId() == 1 && device instanceof Light) {
                device.turnOn();
            }
            if (device.getId() == 2 && device instanceof Thermostat) {
                ((Thermostat) device).setTemperature(75);
            }
            // Add more commands as needed
        }
    }

    private static void printStatusReport() {
        // Print status report
        System.out.println("Current Status Report:");
        for (SmartDevice device : devices) {
            System.out.println("Device ID: " + device.getId() + ", Type: " + device.getType() + ", Status: " + device.getStatus());
        }
        System.out.println();
    }

    private static void scheduleTasks() {
        // Schedule tasks (assuming Thermostat can be scheduled to turn on at 06:00)
        for (SmartDevice device : devices) {
            if (device.getId() == 2 && device instanceof Thermostat) {
                System.out.println("Scheduled Task:");
                System.out.println("Device ID: " + device.getId() + ", Time: 06:00, Command: Turn On");
                System.out.println();
            }
        }
    }

    private static void simulateAutomationTriggers() {
        // Simulate automation triggers (turn off lights if thermostat temperature >= 75)
        for (SmartDevice device : devices) {
            if (device.getId() == 2 && device instanceof Thermostat) {
                int temperature = ((Thermostat) device).getTemperature();
                if (temperature >= 75) {
                    for (SmartDevice dev : devices) {
                        if (dev.getId() == 1 && dev instanceof Light) {
                            dev.turnOff();
                            System.out.println("Temperature is " + temperature + ". Turning off the light.");
                        }
                    }
                }
            }
        }
        System.out.println();
    }
}
