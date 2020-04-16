import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first length: ");
        int a = input.nextInt();
        System.out.print("Input the second length: ");
        int b = input.nextInt();
        System.out.print("Input the third length: ");
        int c = input.nextInt();
        if (a + b > c & a + c > b & b + c > a) {
            System.out.println("Triangle is possible");
        } else {
            System.out.println("Triangle is not possible");
        }
    }
}
