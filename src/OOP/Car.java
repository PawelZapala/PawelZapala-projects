package OOP;

public class Car extends Transport {
    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving");
    }

    @Override
    public void capacity(int people) {
        int maxPeople = 5;
        if (people <= maxPeople) {
            System.out.println("There are " + people + " people in the " + getName());
        } else {
            System.out.println(getName() + " can't start because car accommodate only " + maxPeople + " people");
        }
    }
}
