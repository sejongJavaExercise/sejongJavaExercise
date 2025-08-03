package chapter14.notion.question16;

import java.util.*;
import java.util.stream.*;

public class Question16 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

        System.out.println(stream.max(Integer::compareTo).orElse(-1));
    }
}
