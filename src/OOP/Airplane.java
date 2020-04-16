package OOP;

public class Airplane extends PublicTransport {
    public Airplane (String name){
        super(name);
    }
    @Override
    public void move(String surface){
        super.move("Air");
        this.setMove(true);
        System.out.println(getName() + " is flying in the " + surface);
    }
    @Override
    public void capacity(int people){
        super.capacity(100);
        System.out.println(getName() + " can seat " + people + " on board.");
    }
}
