package ObjectMethods;

public class Processor implements Cloneable{
    public String name;
    public double frequency;
    public int numberOfCores;

    public Processor(String name, double frequency, int numberOfCores) {
        this.name = name;
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", numberOfCores=" + numberOfCores +
                '}';
    }
}
