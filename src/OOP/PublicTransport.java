package OOP;

public class PublicTransport extends Transport {
    public PublicTransport(String name){
        super(name);
    }
        public void capacity (int people){
            System.out.println(getName() + " can accommodate " + people + " people.");
    }
}
