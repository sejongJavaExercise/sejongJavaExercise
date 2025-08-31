package chapter12.practice.question10;

public class StringToEnum {
    public static void main(String[] args) {
        Week day = Week.SAT;  // enum을 직접 사용
        if (isWeekend(day)) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Weekday");
        }
    }

    static boolean isWeekend(Week day){
        return day == Week.SAT || day == Week.SUN;
    }
}

enum Week {
    MON, TUE, WED, THU, FRI, SAT, SUN
}
