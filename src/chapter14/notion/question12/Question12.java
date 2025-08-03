package chapter14.notion.question12;

import java.util.*;
import java.util.stream.*;

public class Question12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("김", "이", "박", "최", "홍");
        Stream<String> stream = list.stream();
        stream.filter(s -> s.equals("홍")).map(s -> s + "박사").forEach(System.out::println);
    }
}
