package AlgoritmTasks;

public class Factorial {
    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        if (n <= 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String args[]) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(factorial(i) + " ");
        }
    }
}