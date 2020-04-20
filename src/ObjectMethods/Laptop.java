package ObjectMethods;

public class Laptop {
    public String name;
    private final Processor processor;
    private final HardDrive hardDrive;
    public int displaySize;
    public int weight;
    public int ramAmount;

    public Laptop(String name, Processor processor, HardDrive hardDrive, int displaySize, int weight, int ramAmount) {
        this.name = name;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.displaySize = displaySize;
        this.weight = weight;
        this.ramAmount = ramAmount;
    }
}
