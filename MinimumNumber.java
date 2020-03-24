public class MinimumNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 10, -5, 0};
        int minNumber = numbers[0];
        for (int currentNumber : numbers) {
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }
        System.out.println(minNumber);
    }
}
