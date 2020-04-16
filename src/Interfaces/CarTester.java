package Interfaces;

public class CarTester {

    public static void main(String[] args) {
        FuelCar audi = new FuelCar("Audi", "R8");
        ElectricCar tesla = new ElectricCar("Tesla", "X P90D");
        HybridCar lexus = new HybridCar("Lexus", "UX");
        Car[] cars = {audi, tesla, lexus};

        for (Car car : cars) {
            if (car instanceof Tankable) {
                ((Tankable) car).tank();
            }
            if (car instanceof Chargeable) {
                ((Chargeable) car).charge();
            }
        }
    }
}
