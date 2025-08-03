package chapter12.notion.question16;

public class Question16 {
    public static void main(String[] args) {
        enum Day { SUN, MON, TUE, WED, THU, FRI, SAT }
        enum Season { SPRING, SUMMER, AUTUMN, WINTER }

        Day question16_1 = Day.SUN;
        boolean question16_2 = Day.SUN == Day.MON;
        int question16_3 = Day.SUN.compareTo(Day.MON);
        Season[] seasons = Season.values();
        String question16_5 = seasons[1].name();
        int question16_6 = Season.AUTUMN.ordinal();
        Season question16_7 = Season.valueOf("WINTER");
    }
}
