package JavaLoops;

import java.util.Scanner;
public class InputCheck {
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please, input your text: ");
            text = input.nextLine();
        } while (!text.contains("exit"));
    }
}
