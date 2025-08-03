package chapter14.notion.question4;

public class Question4 {
    public static void main(String[] args) {
        FunctionalInterfaceOfQuestion4 f = new FunctionalInterfaceOfQuestion4() {
            @Override
            public int apply(int x) {
                return x * x;
            }
        };
        //FunctionalInterfaceOfQuestion4 f = x -> x * x;

        int a = 10;
        int b = f.apply(a);
        System.out.println(b);
    }
}

@FunctionalInterface
interface FunctionalInterfaceOfQuestion4 {
    int apply(int x);
}