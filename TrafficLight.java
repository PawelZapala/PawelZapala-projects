import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the light?");
            String light = input.nextLine();
            light = light.toUpperCase();
        if (light.equals ("GREEN")) {
            System.out.println("GO!");
        } else if (light.equals ("YELLOW")) {
            System.out.println("STOP!");
        } else if (light.equals ("RED")) {
            System.out.println("STOP!");
        } else if (light.contains("RED") & light.contains("YELLOW")) {
            System.out.println("READY TO GO!");
        }
    }
}
