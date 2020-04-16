package CheckingConditions;

import java.util.Scanner;
public class TrafficLight2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the light?");
            String light = input.next();
            light = light.toUpperCase();
        switch (light) {
            case "GREEN":
                System.out.println("GO!");
                break;
            case "YELLOW":
                System.out.println("STOP!");
                break;
            case "RED":
                System.out.println("STOP!");
                break;
            case "RED+YELLOW":
                System.out.println("GET READY TO GO!");
                break;
        }
        }
}