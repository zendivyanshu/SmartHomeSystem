package devices;

public class Light extends SmartDevice {

    public Light(int id, String status) {
        super(id, "light", status);
    }

    @Override
    public void turnOn() {
        setStatus("on");
        System.out.println("Light with ID " + getId() + " turned on.");
    }

    @Override
    public void turnOff() {
        setStatus("off");
        System.out.println("Light with ID " + getId() + " turned off.");
    }

    // Method to schedule turning on the light at a specific time
    public void scheduleTurnOn(String time) {
        System.out.println("Scheduled to turn on light with ID " + getId() + " at " + time);
        // Implement scheduling logic here
    }

    // Method to schedule turning off the light at a specific time
    public void scheduleTurnOff(String time) {
        System.out.println("Scheduled to turn off light with ID " + getId() + " at " + time);
        // Implement scheduling logic here
    }

    // Method to handle triggering based on conditions
    public void handleTrigger(boolean condition) {
        if (condition) {
            turnOn();
        } else {
            turnOff();
        }
    }
}
