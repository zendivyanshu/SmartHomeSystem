// SmartDeviceFactory.java
package factory;

import devices.DoorLock;
import devices.Light;
import devices.SmartDevice;
import devices.Thermostat;

public class SmartDeviceFactory {
    public static SmartDevice createSmartDevice(int id, String type, String statusOrTemperature) {
        switch (type.toLowerCase()) {
            case "light":
                return new Light(id, statusOrTemperature);
            case "thermostat":
                return new Thermostat(id, Integer.parseInt(statusOrTemperature));
            case "door":
                return new DoorLock(id, statusOrTemperature);
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}
