package ClassesAndObjects;

public class Engine {
    private String name;
    private int horsePower;
    private int capacity;
    private boolean started;

    public Engine(String name, int hp, int capacity) {
        this.name = name;
        this.horsePower = hp;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isStarted() {
        return started;
    }

    public void startEngine() {
        if (!started) {
            started = true;
        }
    }

    public void stopEngine() {
        if (started) {
            started = false;
        }
    }
}