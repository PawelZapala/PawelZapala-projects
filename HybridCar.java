package Interfaces;

public class HybridCar extends Car2 implements Tankable, Chargeable{
    public HybridCar(String manufacture, String model){
        super(manufacture, model);
    }
    @Override
    public void tank(){
        System.out.println("Car i tanking");
    }
    @Override
    public void charge(){
        System.out.println("Car is charging");
    }
}
