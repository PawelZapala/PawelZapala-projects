package AlgoritmTasks;

public class FibonacciSequence {
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }
    public static void main(String args[]) {
        int n=10;
        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}