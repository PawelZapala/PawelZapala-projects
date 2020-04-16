package OOP;

public class Motorbike extends Transport {
    public Motorbike (String name){
        super(name);
    }
    @Override
    public void move(String surface){
        super.move("road");
        setMove(true);
    }
}
