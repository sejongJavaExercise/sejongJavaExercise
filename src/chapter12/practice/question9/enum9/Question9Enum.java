package chapter12.practice.question9.enum9;

public class Question9Enum {
    public static void main(String[] args) {
        Week day = Week.SAT;
        if (isWeekend(day)) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Weekday");
        }
    }

    static boolean isWeekend(Week day){
        return day.equals(Week.SAT) || day.equals(Week.SUN);
    }
}

enum Week{
    MON, TUE, WED, THU,
    FRI, SAT, SUN
}