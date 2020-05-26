package Enums;

public class Tester {
    public static void main(String[] args) {

        System.out.println(DayOfWeek.fromEnglishName("Monday"));
        System.out.println(DayOfWeek.fromEnglishName("Sunday"));

        System.out.println("===============");

        System.out.println(DayOfWeek.fromPolishName("Środa"));
        System.out.println(DayOfWeek.fromPolishName("Piątek"));

        System.out.println("===============");

        System.out.println("Weekend days: " + DayOfWeek.getWeekend());

        System.out.println("=================");

        System.out.println("Working days: " + DayOfWeek.getWorkingDays());

        System.out.println("================");


        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            System.out.println(dayOfWeek.isWeekend());
        }
    }
}
