package Enums;

public class Tester {
    public static void main(String[] args) {

        DayOfWeek d = DayOfWeek.valueOf("MON");
        System.out.println(d);

        System.out.println(DayOfWeek.isWeekend("Sunday"));
        System.out.println(DayOfWeek.isWeekend("Poniedziałek"));
        System.out.println(DayOfWeek.isWeekend("Sobota"));


        d = DayOfWeek.fromEnglishName("Tuesday");
        System.out.println(d);

        d = DayOfWeek.fromPolishName("Poniedziałek");
        System.out.println(d);

        System.out.println("=========");

        DayOfWeek.getWeekend();
        System.out.println("==========");
        DayOfWeek.getWorkingDays();
    }
}
