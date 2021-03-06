package Enums;

import java.util.EnumSet;

public enum DayOfWeek {
    MON ("Monday", "Poniedziałek", true),
    TUE ("Tuesday", "Wtorek", true),
    WED ("Wednesday", "Środa", true),
    THU ("Thursday", "Czwartek", true),
    FRI ("Friday", "Piątek", true),
    SAT ("Saturday", "Sobota", false),
    SUN ("Sunday", "Niedziela", false);

    private String englishName;
    private String polishName;
    public boolean workingDay;

    DayOfWeek(String englishName, String polishName, boolean workingDay) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.workingDay = workingDay;
    }

    public static DayOfWeek fromPolishName (String polishName){
        for (DayOfWeek dayOfWeek : values()){
            if (dayOfWeek.polishName.equals(polishName)) {
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There is no day of week \"" + polishName + "\" in polish");
    }

    public static DayOfWeek fromEnglishName (String englishName){
        for (DayOfWeek dayOfWeek : values()){
            if (dayOfWeek.englishName.equals(englishName)){
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There is no day of week \"" + englishName + "\" in english");
    }

    public static EnumSet<DayOfWeek> getWorkingDays () {
        EnumSet<DayOfWeek> workingDays = EnumSet.noneOf(DayOfWeek.class);
        for (DayOfWeek dayOfWeek : values()) {
            if(dayOfWeek.isWorkingDay()){
                workingDays.add(dayOfWeek);
            }
        }
        return workingDays;
    }

    public static EnumSet<DayOfWeek> getWeekend () {
        return EnumSet.complementOf(getWorkingDays());
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public boolean isWeekend () {
        return !workingDay;
    }
}
