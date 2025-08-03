package chapter14.notion.question13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Stream<Integer> stream = list.stream();

        System.out.println(stream.distinct().count());
    }
}
