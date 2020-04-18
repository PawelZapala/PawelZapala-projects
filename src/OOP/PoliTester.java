package OOP;

public class PoliTester {
    public static void main(String[] args) {
        Transport boeing = new Airplane("Boeing");
        boeing.move();
        Transport car = new Car("Audi");
        car.move();
        car.capacity(10);
    }
    public static void transportMoving(Transport transport){
        if (transport instanceof Airplane) {
            Airplane airplane = (Airplane) transport;
            airplane.fly();
        }
        transport.move();
    }
}
