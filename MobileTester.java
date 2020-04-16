public class MobileTester {
    public static void main(String[] args) {
        MobilePhone samsung = new MobilePhone("Samsung", "Galaxy", 1000, 500);
samsung.install("Google maps", 100);
samsung.install("Tinder", 200);
samsung.install("Pokemon GO", 250);
samsung.use("YouTube", 5);
samsung.use("Facebook", 6);
samsung.use("Angry Birds", 2);
samsung.chargePhone();
samsung.use("Angry Birds", 2);
    }
}
