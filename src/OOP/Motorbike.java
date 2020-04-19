package OOP;

public class Motorbike extends Transport {
    public Motorbike (String name){
        super(name);
    }

    @Override
    public void move(){
        System.out.println(getName() + " is moving");
    }

    @Override
    public void capacity(int people) {
        int maxPeople = 2;
        if (people <= maxPeople){
            System.out.println(getName() + " is using by " + people + " people");
        } else {
            System.out.println(getName() + " can't accommodate so many people. Max people is: " + maxPeople);
        }
    }
}
