package chapter14.practice.question8;

import java.util.*;
import java.util.stream.Collectors;

public class NameLowerCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Christopher", "Jennifer", "Ariana", "Angelina");
        List<String> lowerCasedNames = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(lowerCasedNames);
    }
}
