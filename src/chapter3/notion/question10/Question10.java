package chapter3.notion.question10;

public class Question10 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(true || a);
        System.out.println(a || b);
        System.out.println(!a || b);
        System.out.println(1 > 0 && a);
        System.out.println(a && b);
        System.out.println(0 > 1 && b);
    }
}
