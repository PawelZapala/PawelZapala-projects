package OOP;

public class PoliTester {
    public static void main(String[] args) {
        Transport bmx = new Bicycle("bmx");
        bmx.move("path");
        PublicTransport L36 = new Tram("L36");
        L36.move("rails");
        L36.capacity(5);
    }
}
