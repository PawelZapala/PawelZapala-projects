package OOP;

public class Bicycle extends Transport {
    public Bicycle (String name){
        super (name);
    }
    @Override
    public void move(String surface){
        super.move("bicycle path");
        setMove(true);
        System.out.println(getName() + " is moving on the " + surface);
    }
}
