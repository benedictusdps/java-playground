public class Droid {
    // instance field
    int batteryLevel;
    String name;

    // constructor method
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    // perform task method
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    // energy report method
    public void energyReport() {
        System.out.println(name + " energy level is: " + batteryLevel);
    }

    // energy transfer method
    public void energyTransfer() {
        batteryLevel = 100;
    }

    public static void main(String[] args) {
        // Create new Droid called Codey
        Droid Codey = new Droid("Codey");
        System.out.println(Codey);

        // The droid will perform some task
        Codey.performTask("Cleaning");
        Codey.performTask("Making Coffee");
        Codey.energyReport();
        Codey.energyTransfer();
        Codey.energyReport();
    }

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }
}