package OOP;

public class Airplane extends PublicTransport {
    public Airplane (String name){
        super(name);
    }
    @Override
    public void move(){
        fly();
    }

    @Override
    public void passengers(int people) {
        int maxPeople = 100;
        if (people <= maxPeople){
            System.out.println(getName() + " have " + people + " passengers on the board");
        }else{
            System.out.println(getName() + " can accommodate only " + maxPeople + " passengers");
        }
    }

    public void fly() {
        System.out.println(getName() + " is flying in the air.");
    }
}
