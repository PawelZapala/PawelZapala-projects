package Interfaces;

public class Car2 {
    private String manufacture;
    private String model;

    public Car2(String manufacture, String model){
        this.manufacture = manufacture;
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
