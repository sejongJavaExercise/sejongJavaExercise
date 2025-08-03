package chapter10.notion.question3;

import java.util.Calendar;

public class Question3 {
    public static void main(String[] args) {
        Calendar currentTime = Calendar.getInstance();
        int question3_1 = currentTime.get(Calendar.YEAR);
        int question3_2 = currentTime.get(Calendar.MONTH);
        int question3_3 = currentTime.get(Calendar.DATE);
        int question3_4 = currentTime.get(Calendar.HOUR);
        int question3_5 = currentTime.get(Calendar.MINUTE);
        int question3_6 = currentTime.get(Calendar.SECOND);
        int question3_7 = currentTime.get(Calendar.AM_PM);
        int question3_8 = currentTime.get(Calendar.DAY_OF_WEEK);
        int question3_9 = currentTime.getActualMaximum(Calendar.DATE);
    }
}
