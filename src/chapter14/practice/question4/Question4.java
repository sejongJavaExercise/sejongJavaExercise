package chapter14.practice.question4;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 3 == 0) {
                list.remove(i);
            }
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
