package chapter3.notion.question12;

public class Question12 {
    public static void main(String[] args) {
        int a = 111;
        int b = 333;
        int c = a > 100 ? (a % 10 == 3 ? 3 : 2) : 1;
        int d = b > 100 ? (b % 10 == 3 ? 3 : 2) : 1;
        System.out.println(c);
        System.out.println(d);
    }
}
