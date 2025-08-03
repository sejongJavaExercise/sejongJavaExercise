package chapter14.notion.question5;

import java.util.function.*;

public class Question5 {
    public static void main(String[] args) {
        Function<String, Integer> methodReference_1 = s -> Integer.parseInt(s);
        System.out.println(methodReference_1.apply("123"));

        Function<String, String> methodReference_2 = s -> s.toUpperCase();
        System.out.println(methodReference_2.apply("abc"));

        Consumer<String> methodReference_3 = s -> System.out.println(s);
        methodReference_3.accept("DEF");
    }
}
