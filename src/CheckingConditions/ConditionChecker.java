package CheckingConditions;

public class ConditionChecker {
    public static void main(String[] args) {
        if (true) {
            System.out.println("This line always be executed");
        }
        if (5 <= 3) {
            System.out.println("This line won't be shown");
        }

        String text = "IT-Academy";
        if (text.contains("-")) {
            System.out.println("Text contains - : " + text);
        }

        int number = 5;
        if (number >= 10) {
            System.out.println("Number is >= 10");
        } else {
            System.out.println("Number is < 10");
        }

        double temperature = 10.0;
        if (temperature == 5.0) {
            System.out.println(" Shut down PC!");
        } else if (temperature != 5.0) {
            System.out.println("Run cooler FAN on high speed");
        } else if (temperature == 10.0) {
            System.out.println(" Run cooler FAN ob low speed");
        } else {
            System.out.println("Switch off FAN");
        }
        System.out.println("================");

        double airTemperature = 25.1;
        String weatherCondition = "warm weather";
        System.out.println(weatherCondition + " today");

        String weatherCondition2 = "";
        if (airTemperature > 19) {
            weatherCondition2 = "warm weather";
        } else {
            weatherCondition2 = "cold weather";
        }
        System.out.println(weatherCondition2 + " today");

        int a = 1;
        int b = 2;
        a++;
        a = a + b;
        b++;
        if (a <= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
