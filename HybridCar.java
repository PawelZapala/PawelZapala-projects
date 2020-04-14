package Interfaces;

public class HybridCar extends Car implements Tankable, Chargeable{
    public HybridCar(String manufacture, String model){
        super(manufacture, model);
    }
    @Override
    public void tank(){
        System.out.println(getManufacture() + " " + getModel() + " is tanking");
    }
    @Override
    public void charge(){
        System.out.println(getManufacture() + " " + getModel() + "  is charging");
    }
}
