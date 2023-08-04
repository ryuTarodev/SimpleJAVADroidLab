
public class Droid {
    // field
    private String name;
    private int battery = 100;

    // constructor
    public Droid(String name) {
        this.name = name;
    }

    // Method
    public int performingTask(String task) {
        if (battery == 0) {
            System.out.println("Out of battery");
        } else if (task.length() > 0) {
            this.battery -= 10;

        }
        return 0;
    }

    public int chargingBot(int charge) {
        battery += charge;
        if (battery > 100) {
            battery = 100;
        }
        return battery;
    }

    // getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
