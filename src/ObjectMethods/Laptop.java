package ObjectMethods;

public class Laptop implements Cloneable{
    public String name;
    private Processor processor;
    private HardDrive hardDrive;
    public double displaySize;
    public int weight;
    public int ramAmount;

    public Laptop(String name, Processor processor, HardDrive hardDrive, double displaySize, int weight, int ramAmount) {
        this.name = name;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.displaySize = displaySize;
        this.weight = weight;
        this.ramAmount = ramAmount;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Laptop clonedLaptop = (Laptop) super.clone();
        clonedLaptop.displaySize = this.displaySize;
        clonedLaptop.name = this.name;
        clonedLaptop.ramAmount = this.ramAmount;
        clonedLaptop.weight = this.weight;
        clonedLaptop.hardDrive = this.hardDrive;
        clonedLaptop.processor = this.processor;
        return super.clone();
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", processor=" + processor +
                ", hardDrive=" + hardDrive +
                ", displaySize=" + displaySize +
                ", weight=" + weight +
                ", ramAmount=" + ramAmount +
                '}';
    }
}
