package devices;

public class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(int id, int temperature) {
        super(id, "thermostat", "idle");
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat with ID " + getId() + " temperature set to " + temperature);
    }

    @Override
    public void turnOn() {
        // Implement turn on logic for thermostat if needed
        System.out.println("Thermostat with ID " + getId() + " turned on.");
    }

    @Override
    public void turnOff() {
        // Implement turn off logic for thermostat if needed
        System.out.println("Thermostat with ID " + getId() + " turned off.");
    }
}
