package ClassesAndObjects;

public class MobilePhone {
    private String brand;
    private String model;
    private final int batteryCapacity;
    private int batteryAmount;
    private final int memory;
    private int freeMemory;

    public MobilePhone(String brand, String model, int bc, int m) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = bc;
        this.batteryAmount = bc;
        this.memory = m;
        this.freeMemory = m;
    }

    public void chargePhone() {
        batteryAmount = batteryCapacity;
        System.out.println(brand + model + " has been charged. Remain battery capacity: " + batteryCapacity + "mAh");
        }

    public void use(String applicationName, int hoursQuantity){
        var batteryAmountRequired = hoursQuantity * 100;

        if (batteryAmount >= batteryAmountRequired) {
            batteryAmount -= batteryAmountRequired;
            System.out.println(applicationName + " has been used for " + hoursQuantity +" hours on " + brand + model + ". Remain battery capacity: " + batteryAmount + " mAh");
        } else if (batteryAmount == 0){
            System.out.println(applicationName + " can't be run on " + brand + model + ". Phone discharged" );
             } else {
            System.out.println(applicationName + " has been used for " + batteryAmount / 100 + " hours on " + brand + model + ". Phone has been discharged.");
            batteryAmount = 0;
        }
    }

    public void install(String applicationName, int appMemory) {
        if (freeMemory >= appMemory) {
            freeMemory -= appMemory;
            System.out.println(applicationName + " has been installed on " + brand + model + ". Remain memory " + freeMemory + "MB");
        } else {
            System.out.println(applicationName + " can't be installed on " + brand + model + ". There are no memory.");
        }
    }
}
