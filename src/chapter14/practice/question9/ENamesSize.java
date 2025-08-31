package chapter14.practice.question9;

import java.util.*;

public class ENamesSize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Christopher", "Jennifer", "Ariana", "Angelina");
        long count = list.stream()
                .filter(name -> name.toLowerCase().contains("e"))
                .count();
        System.out.println(count);
    }
}