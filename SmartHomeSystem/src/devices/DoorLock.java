package devices;

public class DoorLock extends SmartDevice {

    public DoorLock(int id, String status) {
        super(id, "door", status);
    }

    @Override
    public void turnOn() {
        // Implement turn on logic for door lock
        setStatus("unlocked");
        System.out.println("Door lock with ID " + getId() + " unlocked.");
    }

    @Override
    public void turnOff() {
        // Implement turn off logic for door lock
        setStatus("locked");
        System.out.println("Door lock with ID " + getId() + " locked.");
    }
}
