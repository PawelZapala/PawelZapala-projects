public class MobilePhone {
    private String brand;
    private String model;
    private int batteryCapacity;
    private int batteryAmount;
    private int memory;
    private int freeMemory;


    public MobilePhone(String brand, String model, int bc, int m) {
        this.brand = brand;
        this.model = model;
        batteryCapacity = bc;
        memory = m;
    }

    public void chargePhone() {
        batteryAmount = batteryCapacity;
        System.out.println(brand + model + " has been charged. Remain battery capacity: " + batteryCapacity + "mAh");
        }

    public void use(String applicationName, int n){
        batteryAmount = batteryCapacity - n*100;
        if (batteryAmount >= 0) {
            batteryCapacity = batteryAmount - n*100;
            System.out.println(applicationName + " has been used for 5 hours on " + n + " hours on " + brand + model + ". Remain battery capacity: " + batteryAmount + "mAh");
        } else {
            System.out.println(applicationName + " can't be run on " + brand + model + ". Phoned discharged");
        }
    }

    public void install(String applicationName, int appMemory) {
        freeMemory = memory - appMemory;
        if (freeMemory < 0){
            memory = freeMemory + appMemory;
            System.out.println(applicationName + " can't be installed on " + brand + model + ". There are no memory.");
        } else {
            memory = freeMemory - appMemory;
            System.out.println(applicationName + " has been installed on " + brand + model);
        }
    }
}
