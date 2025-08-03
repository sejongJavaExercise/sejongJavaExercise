package chapter12.practice.question6;

import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        List list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        List list2 = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 9, 10));
        arrayElementSwap(list1, list2, 2);
        System.out.println(list1.toString());
        System.out.println(list2.toString());
    }

    static <T> void arrayElementSwap(List<T> list1, List<T> list2, int index){
        T tmp;
        tmp = list1.get(index);
        list1.set(index, list2.get(index));
        list2.set(index, tmp);
    }
}
