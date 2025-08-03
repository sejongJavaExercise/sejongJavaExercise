package chapter9.practice.question5;

public class Question5 {
    public static void main(String[] args) {
        double d = 1234.5678;
        d *= 1000;
        d = Math.round(d);
        d /= 1000.0;
        System.out.println(d);
    }
}
