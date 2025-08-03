package chapter14.notion.question17;

import java.util.*;
import java.util.stream.*;

public class Question17 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Stream<Integer> stream = list.stream();

        System.out.println(stream.min(Integer::compareTo).orElse(-1));
    }
}
