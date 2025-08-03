package chapter12.practice.question9;

public class Question9String {
    public static void main(String[] args) {
        String day = "Sat";
        if (isWeekend(day)) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Weekday");
        }
    }

    static boolean isWeekend(String day){
        return day.equals(Week.SAT) || day.equals(Week.SUN);
    }
}

class Week{
    static final String MON = "MON";
    static final String TUE = "TUE";
    static final String WED = "WED";
    static final String THU = "THU";
    static final String FRI = "FRI";
    static final String SAT = "SAT";
    static final String SUN = "SUN";
}