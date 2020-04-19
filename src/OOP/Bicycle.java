package OOP;

public class Bicycle extends Transport {
    public Bicycle (String name){
        super (name);
    }

    @Override
    public void tank() {
        System.out.println(getName() + " doesn't refuel");
    }

    @Override
    public void move(){
        System.out.println(getName() + " is moving od the bicycle path");
    }

    @Override
    public void capacity(int people) {
        System.out.println(getName() + " can be led only by one cyclist");
    }
}
