package Interfaces;

public class ElectricCar extends Car implements Chargeable {
    public ElectricCar (String manufacture, String model){
        super(manufacture, model);
    }
    @Override
    public void charge(){
        System.out.println(getManufacture() + " " + getModel() + "  is charging");
    }
}
