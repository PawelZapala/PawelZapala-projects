package OOP;

public class Bus extends PublicTransport {
    public Bus (String name){
        super(name);
    }
    @Override
    public void move(String surface){
    super.move("road");
    setMove(true);
        System.out.println(getName() + " is moving on the " + surface);
    }
    @Override
    public void capacity(int people){
        super.capacity(25);
        System.out.println(getName() + " can accommodate " + people + " people");
    }
}
