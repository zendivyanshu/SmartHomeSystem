package hub.proxy;

import devices.SmartDevice;

public class SmartDeviceProxy extends SmartDevice {
    private SmartDevice realDevice;

    public SmartDeviceProxy(SmartDevice realDevice) {
        super(realDevice.getId(), realDevice.getType(), "off");
        this.realDevice = realDevice;
    }

    @Override
    public void turnOn() {
        System.out.println("Accessing device...");
        realDevice.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Accessing device...");
        realDevice.turnOff();
    }

    @Override
    public String getStatus() {
        System.out.println("Accessing device...");
        return realDevice.getStatus();
    }

    public void grantAccess() {
        // Additional logic to grant access to the real device
        System.out.println("Access granted to device.");
    }
}
