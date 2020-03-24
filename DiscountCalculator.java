import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much this item cost?");
        int a = sc.nextInt();
        System.out.println("How old are you?");
        int b = sc.nextInt();
        if (b < 6) {
            double d = a - a * 0.8;
            System.out.format("Discounted price is %.2f\n", d);
        } else if (b >= 6 & b < 18){
            double d = a - a * 0.25;
            System.out.format("Discounted price is %.2f\n", d);
        } else if (b > 65) {
            double d = a - a * 0.3;
            System.out.format("Discounted price is %.2f\n", d);
        } else {
            System.out.println("There is no discount for people in your age");
        }
    }
}
