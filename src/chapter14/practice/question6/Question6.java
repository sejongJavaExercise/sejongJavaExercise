package chapter14.practice.question6;

import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer max = list.get(0);
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
