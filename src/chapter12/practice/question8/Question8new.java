package chapter12.practice.question8;

import java.util.*;

public class Question8new {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Number> numberList = new ArrayList<>();
        copyList(integerList, numberList);
        System.out.println(numberList);
        List<Double> doubleList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        copyList(doubleList, numberList);
        System.out.println(numberList);
    }

    static <T> void copyList(List<? extends T> source, List<? super T> destination) {
        destination.clear();
        destination.addAll(source);
    }
}

