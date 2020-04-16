package Interfaces;

public class ElectricCar extends Car2 implements Chargeable {
    public ElectricCar (String manufacture, String model){
        super(manufacture, model);
    }
    @Override
    public void charge(){
        System.out.println("Car is charging");
    }
}
