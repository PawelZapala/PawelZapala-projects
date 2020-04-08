public class Engine {
    private String name;

    public String getName() {
        return name;
    }

    private int horsePower;
    private int capacity;
    private boolean started;

    public boolean isStarted() {
        return started;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Engine(String name, int hp, int capacity) {
        this.name = name;
        this.horsePower = hp;
        this.capacity = capacity;
    }

    public void startEngine() {
            started = true;
    }

    public void stopEngine() {
            started = false;
        }
    }