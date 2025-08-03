package chapter14.practice.question2;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(calculate(cube(), 10));
    }

    static int calculate(FunctionalInterfaceOfQuestion2 f, int a) {
        return f.apply(a);
    }

    static FunctionalInterfaceOfQuestion2 cube() {
        return x -> x * x * x;
    }
}

@FunctionalInterface
interface FunctionalInterfaceOfQuestion2 {
    int apply(int x);
}
