package chapter12.practice.question2;

import java.util.*;

public class Question2new {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "ghi");

        Collection<String> values = map.values();
        for(String str : values){
            System.out.println(str);
        }
    }
}
