import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("It is raining now?");
        String rain = input.nextLine();
        rain = rain.toUpperCase();
        if (rain.equals ("YES")) {
            System.out.println("Do not forget umbrella!");
        }
        if (rain.equals("NO")) {
            System.out.println("Leave umbrella at home");
        }
    }
}
