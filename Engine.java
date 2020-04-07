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
        if (!started) {
            System.out.println(" is starting " + name + " engine.");
            System.out.println(name + " engine has been started.");
            started = true;
        } else {
            System.out.println(name + " engine has been already started in ");
        }
    }

    public void stopEngine() {
        if (started) {
            System.out.println(" is stopping " + name + " engine.");
            System.out.println(name + " has been stopped.");
            started = false;
        } else {
            System.out.println(name + " has been already stopped.");
        }
    }
}