package chapter14.practice.question3;

import java.util.Arrays;

public class UpperString {
    public static void main(String[] args) {
        String[] arr = new String[]{"abc", "def", "ghi"};
        Arrays.stream(arr)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}