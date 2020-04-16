package OOP;

public class Transport {
    private String name;
    private boolean move;

    public Transport(String name){
        this.name = name;
        this.move = true;
    }

    public String getName() {
        return name;
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    public boolean isMoving() {
        return move;
    }

    public void move (String surface){
        if(move){
            System.out.println(name + " is moving on the " + surface + ".");
            move = true;
        }else{
            System.out.println(name + " is not moving.");
        }
    }
}
