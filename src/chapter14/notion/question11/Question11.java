package chapter14.notion.question11;

import java.util.*;
import java.util.stream.*;

public class Question11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        Stream<Integer> stream = list.stream();
        //sorted()는 오름차순 정렬
        stream.filter(i -> i % 2 == 0).sorted().forEach(System.out::println);
    }
}
