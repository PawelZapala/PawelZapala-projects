package OOP;

public class Bus extends PublicTransport {
    public Bus (String name){
        super(name);
    }

    @Override
    public void move(){
    }

    @Override
    public void passengers(int people) {
        int maxPeople = 25;
        if (people <= maxPeople){
            System.out.println(getName() + " have " + people + " passengers inside");
        }else{
            System.out.println(getName() + " can accommodate only " + maxPeople + " passengers");
        }
    }
}
