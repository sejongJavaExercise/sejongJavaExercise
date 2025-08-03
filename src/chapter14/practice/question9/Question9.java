package chapter14.practice.question9;

import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Christopher", "Jennifer", "Ariana", "Angelina");
        List<String> eList = new ArrayList<>();
        for (String name : list) {
            if(name.contains("e")||name.contains("E")){
                eList.add(name);
            }
        }
        System.out.println(eList.size());
    }
}
