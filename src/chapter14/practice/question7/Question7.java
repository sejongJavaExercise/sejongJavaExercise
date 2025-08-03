package chapter14.practice.question7;

import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> doubleList = new ArrayList<>();
        for (Integer i : list) {
            doubleList.add(i * 2);
        }
        System.out.println(doubleList);
    }
}
