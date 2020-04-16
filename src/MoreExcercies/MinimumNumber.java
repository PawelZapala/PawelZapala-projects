package MoreExcercies;

public class MinimumNumber {
    public static void main(String[] args) {
        int minNumber = Integer.parseInt(args[0]);
        for (String currentNumberValue : args) {
            int currentNumber = Integer.parseInt(currentNumberValue);
            if (currentNumber < minNumber)
                minNumber = currentNumber;
        }
        System.out.println(minNumber);
    }
}