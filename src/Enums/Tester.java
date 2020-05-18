package Enums;

public class Tester {
    public static void main(String[] args) {

        DayOfWeek d = DayOfWeek.valueOf("MON");
        System.out.println(d);

        d = DayOfWeek.fromEnglishName("Tuesday");
        System.out.println(d);

        d = DayOfWeek.fromPolishName("Poniedziałek");
        System.out.println(d);
    }
}
