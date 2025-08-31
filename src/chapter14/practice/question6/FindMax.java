package chapter14.practice.question6;

import java.util.*;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer max = list.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println(max);
    }
}