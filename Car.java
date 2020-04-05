public class Car {
    private String name;
    private final Engine engine;
    private final int fuelTankCapacity;
    private int remainingFuelAmount;

    public Car(String name, Engine engine, int fuelTankCapacity) {
        this.name = name;
        this.engine = engine;
        this.fuelTankCapacity = fuelTankCapacity;
        this.remainingFuelAmount = fuelTankCapacity;
    }

    public void tank() {
        remainingFuelAmount = fuelTankCapacity;
        System.out.println(name + " has been tanked up");
    }

    public void startCar() {
        if (engine.isStarted()) {
            System.out.println(engine.getName() + " engine has been already started in " + name);
        } else {
            engine.setStarted(true);
            System.out.println(name + " is starting " + engine.getName() + " engine.");
            System.out.println(engine.getName() + " engine has been started.");
        }
    }

    public void stopCar() {
        if (engine.isStarted()) {
            engine.setStarted(false);
            System.out.println(name + " is stopping " + engine.getName() + " engine.");
            System.out.println(engine.getName() + " has been stopped.");
        } else {
            System.out.println(engine.getName() + " has been already stopped.");
        }
    }

    public void drive(int speed, double distance) {
        if (!engine.isStarted()) {
            System.out.println(name + " can't be driven cause engine stopped.");
            return;
        }

        var maxspeed = 2 * engine.getHorsePower();
        if (speed > maxspeed) {
            speed = maxspeed;
        }
        var fuelUsed = distance/100 * 10 * engine.getCapacity()/1000;
        if (remainingFuelAmount >= fuelUsed) {
            remainingFuelAmount -= fuelUsed;
            System.out.println("Car " + name + " has been driven for " + distance + "km with " + speed + "km/h. Remaining fuel: " + remainingFuelAmount + "L");
        } else if (remainingFuelAmount == 0) {
            System.out.println("Car " + name + " can't be driven. Tank is empty.");
        }else{
            System.out.println("Car " + name + " has been driven for " + distance + "km with " + speed + "km/h. Tank is empty");
            remainingFuelAmount = 0;
        }
    }
}

