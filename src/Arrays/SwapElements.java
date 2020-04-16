package Arrays;

public class SwapElements {
    public static void main(String[] args) {
        int[] number = {10,20};
        int t;
        t = number[0];
        number[0] = number [1];
        number[1] = t;
        System.out.println(number[0] + " " + number[1]);
    }
}