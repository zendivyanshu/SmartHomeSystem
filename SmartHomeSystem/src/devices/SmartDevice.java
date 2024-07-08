package devices;

public abstract class SmartDevice {
    private int id;
    private String type;
    private String status;

    public SmartDevice(int id, String type, String status) {
        this.id = id;
        this.type = type;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    // Optional: Add methods for scheduling and automation triggers if needed
}
