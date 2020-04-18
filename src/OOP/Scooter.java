package OOP;

public class Scooter extends Transport {
    public Scooter (String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving");

    }

    @Override
    public void capacity(int people) {
        int maxPeople = 2;
        if (people <= maxPeople){
            System.out.println(getName() + " have " + people + " people");
        }else{
            System.out.println(getName() + " can only accommodate " + maxPeople + " people");
        }
    }
}
