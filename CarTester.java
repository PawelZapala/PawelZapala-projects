package Interfaces;

public class CarTester {
    public static void main(String[] args) {
        FuelCar audi = new FuelCar("Audi", "R8");
        FuelCar ford = new FuelCar("Ford", "Mustang");
        FuelCar mercedes = new FuelCar("Mercedes", "AMG");
        ElectricCar tesla = new ElectricCar("Tesla", "X P90D");
        ElectricCar bmw = new ElectricCar("BMW", "i3 60AH");
        ElectricCar nissan = new ElectricCar("Nissan", "Acenta");
        HybridCar hyundai = new HybridCar("Hyundai", "i40");
        HybridCar lexus = new HybridCar("Lexus", "UX");
        HybridCar volvo = new HybridCar("Volvo", "XC90");
        String[] arr = {String.valueOf(audi), String.valueOf(ford), String.valueOf(mercedes), String.valueOf(tesla), String.valueOf(bmw), String.valueOf(nissan), String.valueOf(hyundai), String.valueOf(lexus), String.valueOf(volvo)};

        if (audi instanceof Tankable) {
            audi.tank();
        }
        if (audi instanceof Chargeable) {
            ((Chargeable) audi).charge();
        }
        if (tesla instanceof Tankable) {
            ((Tankable) tesla).tank();
        }
        if (tesla instanceof Chargeable) {
            tesla.charge();
        }
        if (lexus instanceof Tankable) {
            lexus.tank();
        }
        if (lexus instanceof Chargeable) {
            lexus.charge();
        }
    }
}

