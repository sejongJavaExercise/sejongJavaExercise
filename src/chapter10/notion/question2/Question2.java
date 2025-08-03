package chapter10.notion.question2;

import java.util.Calendar;

public class Question2 {
    public static void main(String[] args) {
        //Calendar calendar2 = new Calendar();
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
