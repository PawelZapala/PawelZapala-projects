package OOP;

public class Tram extends PublicTransport {
    public Tram (String name){
        super(name);
    }
    @Override
    public void move(String surface){
        super.move("rails");
        setMove(true);
    }
    @Override
    public void capacity(int people){
        super.capacity(68);
    }
}
