
public class PrimeNumber {
    public static void main(String[] args) {

        int max = 100;
        for (int x = 2; x <= max; x++) {
            boolean isPrime = true;
            for (int y = 2; y < x; y++)
                if (x % y == 0) {
                    isPrime = false;
                    break;
                }
            if (isPrime)
                System.out.println(x);
        }
    }
}
