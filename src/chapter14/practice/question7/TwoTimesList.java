package chapter14.practice.question7;

import java.util.*;
import java.util.stream.Collectors;

public class TwoTimesList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> doubleList = list.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());
        System.out.println(doubleList);
    }
}
