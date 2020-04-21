package ObjectMethods;

public class HardDrive{
    public String name;
    public String type;
    public int capacity;

    public HardDrive(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
