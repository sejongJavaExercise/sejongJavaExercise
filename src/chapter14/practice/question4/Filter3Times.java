package chapter14.practice.question4;

import java.util.*;

public class Filter3Times {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        list.stream()
                .filter(i -> i % 3 != 0)
                .forEach(i -> System.out.print(i + " "));
    }
}