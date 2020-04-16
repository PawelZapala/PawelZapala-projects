package Interfaces;

public class CarTester {

    public static void main(String[] args) {
        FuelCar audi = new FuelCar("Audi", "R8");
        ElectricCar tesla = new ElectricCar("Tesla", "X P90D");
        HybridCar lexus = new HybridCar("Lexus", "UX");
        Car[] cars = {audi, tesla, lexus};

        for (int i=0; i < cars.length; i++) {
            if (cars[i] instanceof Tankable) {
                audi.tank();
                lexus.tank();
            }
            if (cars[i] instanceof Chargeable) {
                tesla.charge();
                lexus.charge();
            }
        }
    }
}

