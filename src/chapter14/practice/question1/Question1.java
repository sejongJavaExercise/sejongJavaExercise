package chapter14.practice.question1;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(square(x -> x * x, 10));
        //System.out.println(multiply(cube(), a));
    }

    static int square(FunctionalInterfaceOfQuestion1 f, int a) {
        return f.apply(a);
    }
}

@FunctionalInterface
interface FunctionalInterfaceOfQuestion1 {
    int apply(int x);
}
