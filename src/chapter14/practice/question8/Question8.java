package chapter14.practice.question8;

import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Christopher", "Jennifer", "Ariana", "Angelina");
        List<String> lowerCasedNames = new ArrayList<>();
        for (String name : list) {
            lowerCasedNames.add(name.toLowerCase());
        }
        System.out.println(lowerCasedNames);
    }
}
