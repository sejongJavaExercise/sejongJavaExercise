package chapter7.notion.question39_2;

public class Question39 { public static void main(String[] args) {} }

class Outer{
    private static int a = 1;
    private int b = 2;

    void method(){
        int c = 3;

        class Inner{
            int d = a;
            int e = b;
            int f = c;
        }

        int g = new Inner().d;
    }


}