package Interfaces;

public class FuelCar extends Car2 implements Tankable {
    public FuelCar(String manufacture, String model){
        super(manufacture, model);
    }
@Override
    public void tank() {
    System.out.println("Car is tanking");
}
}
