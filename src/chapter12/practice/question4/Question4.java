package chapter12.practice.question4;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        append(list1, 5);
        System.out.println(list1);

        List<String> list2 = new ArrayList<String>(Arrays.asList("abc", "def", "ghi", "jkl"));
        append(list2, "mno");
        System.out.println(list2);
    }

    static <T> void append(List<T> list, T a){
        list.add(a);
    }
}


