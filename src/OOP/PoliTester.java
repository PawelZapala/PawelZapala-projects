package OOP;

public class PoliTester {

    public static void main(String[] args) {
    Transport boeing = new Airplane("Boeing");
    Transport car = new Car("Audi");
    Transport bmx = new Bicycle("BMX");
    Transport bus = new Bus ("FlixBus");
    Transport motorbike = new Motorbike("Komar");
    Transport scooter = new Scooter("Scooter");
    Transport train = new Train ("PKP Intercity");
    Transport tram = new Tram("Tram 52");
        transportMoving(boeing);
        transportMoving(car);
        transportMoving(bmx);
        transportMoving(motorbike);
        transportMoving(scooter);
        transportMoving(bus);
        transportMoving(train);
        transportMoving(tram);
}
    public static void transportMoving(Transport transport){
        if (transport instanceof Tram) {
            Tram tram = (Tram) transport;
            tram.charge();
        }
        transport.capacity(10);
        transport.move();
        transport.tank();
    }

}
