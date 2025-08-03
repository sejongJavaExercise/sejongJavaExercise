package chapter9.notion.question7;

public class Question7 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        String d = new String("hello");
        Integer e = new Integer(100);
        Integer f = new Integer(100);

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println(a == c);
        System.out.println(a.equals(c));
        System.out.println(e == f);
        System.out.println(e.equals(f));
    }
}
