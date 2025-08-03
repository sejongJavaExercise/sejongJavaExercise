package chapter14.notion.question14;

import java.util.*;
import java.util.stream.*;

public class Question14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Stream<Integer> stream = list.stream();

        int x = (int) (stream.distinct().peek(i -> System.out.print(i + " ")).count());
        System.out.println();
        System.out.println(x);
    }
}
