package Enums;

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

    public static boolean isWeekend(String dayName) {
        for (DayOfWeek dayOfWeek : values()) {
            if (dayName.equals(dayOfWeek.englishName) || dayName.equals(dayOfWeek.polishName)){
                return !dayOfWeek.isWorkingDay();
            }
        }
        throw new IllegalArgumentException();
    }

    public static void getWeekend () {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if(!dayOfWeek.isWorkingDay()){
                System.out.println(dayOfWeek);
            }
        }
    }

    public static void getWorkingDays () {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if(dayOfWeek.isWorkingDay()){
                System.out.println(dayOfWeek);
            }
        }
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

}
