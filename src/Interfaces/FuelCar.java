package Interfaces;

public class FuelCar extends Car implements Tankable {
    public FuelCar(String manufacture, String model){
        super(manufacture, model);
    }
@Override
    public void tank() {
    System.out.println(getManufacture() + " " + getModel() + " is tanking");
}
}
