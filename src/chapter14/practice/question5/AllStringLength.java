package chapter14.practice.question5;

import java.util.*;

public class AllStringLength {
    public static void main(String[] args) {
        String[] arr = new String[]{"abc", "def", "ghij"};
        int sum = Arrays.stream(arr)
                .mapToInt(String::length)
                .sum();
        System.out.println(sum);
    }
}