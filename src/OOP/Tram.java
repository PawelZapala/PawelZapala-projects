package OOP;

public class Tram extends PublicTransport {
    public Tram (String name){
        super(name);
    }
    @Override
    public void move(){
    }

    @Override
    public void passengers(int people) {
        int maxPeople = 68;
        if (people <= maxPeople){
            System.out.println(getName() + " have " + people + " passengers inside");
        }else{
            System.out.println("The door can't close. There is too many people in the " + getName() + "." + getName() + " can accommodate only " + maxPeople + " passengers");
        }
    }
}
