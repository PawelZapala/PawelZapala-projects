package OOP;

public class Car extends Transport {
    public Car(String name) {
        super(name);
    }

    @Override
    public void move(String surface) {
        super.move(surface);
        this.setMove(false);
    }
}
