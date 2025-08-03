package chapter12.practice.question5;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> b = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 9, 10));
        List<Integer> c = merge(a, b);
        System.out.println(c);
    }

    static <T> List<T> merge(List<T> a, List<T> b) {
        List<T> result = new ArrayList<>(a);
        result.addAll(b);
        return result;
    }
}
