package OOP;

public class PublicTransport extends Transport {
    public PublicTransport(String name){
        super(name);
    }

    @Override
    public void capacity(int people) {
        passengers(people);
    }
    public void passengers(int people) {
    }
}
