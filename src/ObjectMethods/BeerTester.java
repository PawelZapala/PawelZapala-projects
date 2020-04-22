package ObjectMethods;

public class BeerTester {
    public static void main(String[] args) {
        Beer zywiec = new Beer("Żywiec", "IPA", 14, 5.7);
        Beer komes = new Beer("Komes", "Dark", 22, 10);
        Beer perla = new Beer("Perła", "Chmielowa", 12, 6);
        Beer zywiec2 = new Beer("Żywiec", "IPA", 14, 5.7);
        System.out.println(zywiec.equals(komes));
        System.out.println(zywiec.hashCode());
        System.out.println(komes.hashCode());
        System.out.println(komes);
        System.out.println(perla.equals(zywiec));
        System.out.println(perla.hashCode());
        System.out.println(zywiec.hashCode());
        System.out.println(zywiec2.equals(zywiec));
        System.out.println(zywiec.hashCode());
        System.out.println(zywiec2.hashCode());
    }
}
