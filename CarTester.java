public class CarTester {
    public static void main(String[] args) {
        Engine diesel = new Engine("Diesel", 130, 2000);
        Car vw = new Car("VW Golf", diesel, 50);
        vw.drive(100,50);
        vw.startCar();
        vw.startCar();
        vw.stopCar();
        vw.startCar();
        vw.drive(100,50);
        vw.drive(500,50);
        vw.drive(100,200);
        vw.drive(100,50);
        vw.tank();
        vw.drive(100,50);

    }
}
