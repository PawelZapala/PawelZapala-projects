public class Engine {
    private String name;
    private int horsePower;
    private int capacity;

    public String getName() {
        return name;
    }


    public int getCapacity() {
        return capacity;
    }

    private boolean isStarted = false;

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Engine(String name, int hp, int capacity) {
        this.name = name;
        this.horsePower = hp;
        this.capacity = capacity;
    }
}