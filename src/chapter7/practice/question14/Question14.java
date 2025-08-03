package chapter7.practice.question14;

public class Question14 {
    public static void main(String[] args) {
        OuterClass outerInstance = new OuterClass();
        System.out.println(outerInstance.a);
        System.out.println(OuterClass.InstanceClass.CONSTANT);
        System.out.println(OuterClass.StaticClass.b);
    }
}
class OuterClass{
    int a = 1;
    class InstanceClass{
        final static int CONSTANT = 2;
    }
    static class StaticClass{
        static int b = 3;
    }
}